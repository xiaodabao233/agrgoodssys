package com.nsu.service.impl;


import com.nsu.common.CommonValue;
import com.nsu.common.IDCommon;
import com.nsu.dao.UserAccountDao;
import com.nsu.dto.CheckResult;
import com.nsu.dto.UserSignInResult;
import com.nsu.dto.UserSignUpResult;
import com.nsu.entity.UserAccount;
import com.nsu.entity.UserAccountExample;
import com.nsu.exception.DataExistException;
import com.nsu.exception.DataInsertException;
import com.nsu.exception.DataMatchException;
import com.nsu.exception.SystemException;
import com.nsu.service.UserAccountService;
import com.nsu.vo.UserSignUpForm;
import com.nsu.vo.UserSignlnForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserAccountDao userAccountDao;


    @Override
    public UserSignUpResult signUp(UserSignUpForm userSignUpForm, String codeSession) throws SystemException {
        // 检查用户账户名是否已存在

        if (checkUaccountIsExistByName(userSignUpForm.getUserName())) {
            throw new DataExistException("用户名：" + CommonValue.CANNT_USE);
        }else {
            if (!codeSession.equalsIgnoreCase(userSignUpForm.getCode())) {
                //将存储的验证码和用户输入的验证码进行比较，错误则抛出异常
                throw new DataMatchException("验证码错误");
            } else {
//                userSignUpForm.setuId(IDCommon.createID());
                UserAccount user = new UserAccount(
                        userSignUpForm.getUserId(),
                        userSignUpForm.getUserNick(),
                        userSignUpForm.getUserName(),
                        userSignUpForm.getUserPass()
                        );

                try {
                    System.out.println("uid = " + user.getUid());
                    System.out.println("uaccount = " + user.getUaccount());
                     int insertCount = userAccountDao.insert(user);
                    if (insertCount > 0) {
                        return new UserSignUpResult(true, userSignUpForm.getUserName());
                    } else {
                        throw new DataInsertException();
                    }
                } catch (Exception e) {
                    logger.error(e.getMessage(), e);
                    throw new DataInsertException();
                }
            }
        }
    }


    private boolean checkUaccountIsExistByName(String uaccount) {
        UserAccount userAccount = userAccountDao.selectByUaccount(uaccount);
        if (userAccount != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public CheckResult checkUaccountIsExist(String uaccount) {

        if (checkUaccountIsExistByName(uaccount)) {
            return new CheckResult(true, CommonValue.CANNT_USE);
        } else {
            return new CheckResult(false, CommonValue.CAN_USE);
        }
    }

    @Override
    public UserSignInResult signIn(UserSignlnForm userSignInForm, String codeSession) {
        UserAccount userAccount = userAccountDao.selectByUaccount(userSignInForm.getUserName());
        if (userAccount == null) {
            throw new DataExistException("用户不存在");
        }
        if (!userAccount.getUpassword().equals(userSignInForm.getUserPass())) {
            throw new DataMatchException("用户名或密码错误");
        } else {
            if (userAccount.getStatus()!= 1) {
                throw new DataMatchException("用户已被禁用");
            }
            //校验验证码,无视大小写
            if (!codeSession.equalsIgnoreCase(userSignInForm.getCode())) {

                //将存储的验证码和用户输入的验证码进行比较，错误则抛出异常
                throw new DataMatchException("验证码错误");
            } else {
                // PS 用户登录状态保存处理操作在Controller中
                return new UserSignInResult(true, userSignInForm.getUserName());
            }
        }
    }

    @Override
    public List<UserAccount> getAll() {
        return userAccountDao.selectByExample(null);
    }

    @Override
    public void deleteBatch(List<String> uids) {
        UserAccountExample example = new UserAccountExample();
        UserAccountExample.Criteria criteria = example.createCriteria();
        criteria.andUidIn(uids);
        userAccountDao.deleteByExample(example);
    }

    @Override
    public void deleteUserAccount(String uid) {
        userAccountDao.deleteByPrimaryKey(uid);
    }

    @Override
    public void changeStatus(UserAccount userAccount) {
        userAccountDao.changeStatus(userAccount);
    }

    @Override
    public UserAccount getUserAccountByUaccount(String uaccount) {
        return userAccountDao.selectByUaccount(uaccount);
    }

}
