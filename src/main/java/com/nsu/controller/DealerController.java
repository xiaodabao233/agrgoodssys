package com.nsu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsu.entity.Dealer;
import com.nsu.entity.Msg;
import com.nsu.service.impl.DealerServiceImpl;
import com.nsu.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DealerController {

    @Autowired
    DealerServiceImpl dealerServiceImpl;

    @RequestMapping("/dealer-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getDealerWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<Dealer> dealers = dealerServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(dealers, 5);
        return Msg.success().add("pageInfo", page);
    }

    //经销商信息保存
    @RequestMapping(value = "/deler", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveDealer(Dealer dealer) {
        dealerServiceImpl.saveDealer(dealer);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    //客户信息更新
    @ResponseBody
    @RequestMapping(value = "/dealer/{distributorid}", method = RequestMethod.PUT)
    public Msg updateDealer(Dealer dealer, HttpServletRequest request) {
        dealerServiceImpl.updateDealer(dealer);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    @ResponseBody
    @RequestMapping(value = "/dealer/{distributorids}", method = RequestMethod.DELETE)
    public Msg deleteDealer(@PathVariable("distributorids") String distributorids) {
        //批量删除
        if (distributorids.contains("-")) {
            List<String> del_ids = new ArrayList<>();
            String[] str_ids = distributorids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(string);
            }
            dealerServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            dealerServiceImpl.deleteDealer(distributorids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    //根据id查询客户信息
    @RequestMapping(value = "/dealer/{distributorid}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getDealer(@PathVariable("distributorid") String distributorid) {
        Dealer dealer = dealerServiceImpl.getDealer(distributorid);
        return Msg.success().add("dealer", dealer);
    }

    //查出所有客户信息
    @RequestMapping("/dealers")
    @ResponseBody
    public Msg getDealers() {

        List<Dealer> list = dealerServiceImpl.getAll();
        return Msg.success().add("dealers", list);
    }





}
