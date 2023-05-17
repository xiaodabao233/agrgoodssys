package com.nsu.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsu.entity.AgrSales;
import com.nsu.entity.Msg;
import com.nsu.service.impl.AgrSalesServiceImpl;
import com.nsu.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class AgrSalesController {

    @Autowired
    AgrSalesServiceImpl agrSalesServiceImpl;

    @RequestMapping(value = "/agrsales-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getAgrSalesWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<AgrSales> agrSales = agrSalesServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(agrSales, 5);
        return Msg.success().add("pageInfo", page);
    }

    //保存
    @RequestMapping(value = "/agrsales", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveAgrSales(AgrSales agrSales) {
        agrSalesServiceImpl.saveAgrSales(agrSales);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    @RequestMapping(value = "/agrsales/{agroutid}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg updateAgrSalers(AgrSales agrSales, HttpServletRequest request) {
        agrSalesServiceImpl.updateAgrSales(agrSales);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    @RequestMapping(value = "/agrsales/{agroutids}", method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteAgrSalers(@PathVariable("agroutids") String agroutids) {
        //批量删除
        if (agroutids.contains("-")) {
            List<String> del_ids = new ArrayList<>();
            String[] str_ids = agroutids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(string);
            }
            agrSalesServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            agrSalesServiceImpl.deleteAgrSales(agroutids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    //根据ID查询
    @RequestMapping(value = "/agrsales/{agroutid}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getAgrSales(@PathVariable("agroutid") String agroutid) {
        AgrSales agrSales = agrSalesServiceImpl.getAgrSales(agroutid);
        return Msg.success().add("agrSales", agrSales);
    }
}
