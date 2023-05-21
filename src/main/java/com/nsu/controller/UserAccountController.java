package com.nsu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsu.common.CommonResult;
import com.nsu.common.CommonValue;
import com.nsu.dto.CheckResult;
import com.nsu.dto.UserSignInResult;
import com.nsu.dto.UserSignUpResult;
import com.nsu.entity.Msg;
import com.nsu.entity.UserAccount;
import com.nsu.service.UserAccountService;
import com.nsu.service.impl.UserAccountServiceImpl;
import com.nsu.util.LogUtil;
import com.nsu.util.ValidateCode;
import com.nsu.vo.UserSignUpForm;
import com.nsu.vo.UserSignlnForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping(value = "/user")
public class UserAccountController {

    @Autowired
    private UserAccountService userAccountService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserAccountServiceImpl userAccountServiceImpl;

    @ResponseBody
    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public CommonResult<UserSignUpResult> signUp(HttpSession session, UserSignUpForm userSignUpForm) {
        //将生成的验证码存起来用来比较
        String codeSession = (String) session.getAttribute("validateCode");

        logger.info("userSignUpForm={}", userSignUpForm);
        try {
            UserSignUpResult userSignUpResult = userAccountService.signUp(userSignUpForm, codeSession);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
            return new CommonResult<>(true, userSignUpResult);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    e.toString());
            return new CommonResult<>(false, e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    public CommonResult<UserSignInResult> signIn(HttpSession session, UserSignlnForm userSignInForm,
                                                 HttpServletRequest request) {
        //将生成的验证码存起来用来比较
        String codeSession = (String) session.getAttribute("validateCode");

        logger.info("userSignInForm={}", userSignInForm);
        try {
            UserSignInResult userSignInResult = userAccountService.signIn(userSignInForm, codeSession);
            //判断登录成功则将用户名保存在session中
            if (userSignInResult.isSuccess()) {
                HttpSession userNameSession = request.getSession(true);
                userNameSession.setAttribute("userNameSession", userSignInResult.getUaccount());
                UserAccount account = userAccountService.getUserAccountByUaccount(userNameSession.getAttribute("userNameSession").toString());
                session.setAttribute("userName",account.getUaccount());
                session.setAttribute("userNick",account.getUnickname());
                session.setAttribute("registerTime",account.getUpdatetime());
                userNameSession.setMaxInactiveInterval(CommonValue.USER_SESSION_TIMEOUT_MINUTE);
                LogUtil.writeLogs(this.getClass().getName(),
                        Thread.currentThread().getStackTrace()[1].getMethodName(),
                        "");
            } else {
                request.getRequestDispatcher("/webapp/sign-in.jsp");
            }
            return new CommonResult<>(true, userSignInResult);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    e.toString());
            return new CommonResult<>(false, e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping(value = "/checkAccount", method = RequestMethod.POST)
    public CommonResult<CheckResult> checkAccount(String userName) {
        CheckResult checkResult = userAccountService.checkUaccountIsExist(userName);
        return new CommonResult<>(true, checkResult);
    }

    @RequestMapping("/list")
    @ResponseBody
    public Msg getUserAccountWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<UserAccount> userAccounts = userAccountServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(userAccounts, 5);
        return Msg.success().add("pageInfo", page);
    }

    /**
     * 生成验证码
     *
     * @param request
     * @param response
     * @throws IOException
     * @ValidateCode.generateTextCode(验证码字符类型,验证码长度,需排除的特殊字符)
     * @ValidateCode.generateImageCode(文本验证码,图片宽度,图片高度,干扰线的条数,字符的高低位置是否随机,图片颜色,字体颜色,干扰线颜色)
     */

    @RequestMapping(value = "/validateCode")
    public void validateCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Cache-Control", "no-cache");
        String verifyCode = ValidateCode.generateTextCode(ValidateCode.TYPE_NUM_LOWER, 4, null);
        request.getSession().removeAttribute("validateCode");
        request.getSession().setAttribute("validateCode", verifyCode);
        response.setContentType("image/jpeg");
        BufferedImage bim = ValidateCode.generateImageCode(verifyCode, 90, 30, 5, true, Color.WHITE, Color.BLUE, null);
        ImageIO.write(bim, "JPEG", response.getOutputStream());
    }

    @ResponseBody
    @RequestMapping(value = "/signOut", method = RequestMethod.GET)
    public CommonResult signOut(HttpServletRequest request) {
        HttpSession userNameSession = request.getSession(true);
        userNameSession.removeAttribute("userNameSession");
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return new CommonResult(true);
    }

    @ResponseBody
    @RequestMapping(value = "/{uids}", method = RequestMethod.DELETE)
    public Msg deleteUserAccount(@PathVariable("uids") String uids) {
        //批量删除
        if (uids.contains("-")) {
            List<String> del_ids = new ArrayList<>();
            String[] str_ids = uids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(string);
            }
            userAccountServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            userAccountServiceImpl.deleteUserAccount(uids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    //控制用户状态的禁用/启用

//    @RequestMapping(value = "/status/{id}", method = RequestMethod.PUT)
    @ResponseBody
    @RequestMapping(value = "/status/{uid}")
    public Msg changeStatus(UserAccount userAccount, HttpServletRequest request) {
        System.out.println(userAccount.getUid());
        System.out.println(userAccount.getStatus());
        userAccountServiceImpl.changeStatus(userAccount);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }



}
