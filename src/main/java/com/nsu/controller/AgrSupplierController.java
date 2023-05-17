package com.nsu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsu.entity.AgrSupplier;
import com.nsu.entity.Msg;
import com.nsu.service.impl.AgrSupplierServiceImpl;
import com.nsu.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AgrSupplierController {

    @Autowired
    AgrSupplierServiceImpl agrSupplierServiceImpl;

    @RequestMapping("/agrsupplier-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getAgrSupplierWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<AgrSupplier> agrSuppliers = agrSupplierServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(agrSuppliers, 5);
        return Msg.success().add("pageInfo", page);
    }

    //农资商保存
    @RequestMapping(value = "/agrsupplier", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveAgrSupplier(AgrSupplier agrSupplier) {
        agrSupplierServiceImpl.saveAgrSupplier(agrSupplier);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    @ResponseBody
    @RequestMapping(value = "/agrsupplier/{agrsupplierid}", method = RequestMethod.PUT)
    public Msg updateAgrSupplier(AgrSupplier agrSupplier, HttpServletRequest request) {
        agrSupplierServiceImpl.updateAgrSupplier(agrSupplier);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    @ResponseBody
    @RequestMapping(value = "/agrsupplier/{agrsupplierids}", method = RequestMethod.DELETE)
    public Msg deleteAgrSupplier(@PathVariable("agrsupplierids") String agrsupplierids) {
        //批量删除
        if (agrsupplierids.contains("-")) {
            List<String> del_ids = new ArrayList<>();
            String[] str_ids = agrsupplierids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(string);
            }
            agrSupplierServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            agrSupplierServiceImpl.deleteAgrSupplier(agrsupplierids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    @RequestMapping(value = "/agrsupplier/{agrsupplierid}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getAgrSupplier(@PathVariable("agrsupplierid") String agrsupplierid) {
        AgrSupplier agrSupplier = agrSupplierServiceImpl.getAgrSupplier(agrsupplierid);
        return Msg.success().add("agrSupplier", agrSupplier);
    }
}
