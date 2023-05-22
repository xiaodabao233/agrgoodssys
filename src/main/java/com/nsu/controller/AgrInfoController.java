package com.nsu.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsu.entity.AgrInfo;
import com.nsu.entity.Msg;
import com.nsu.service.impl.AgrInfoServiceImpl;
import com.nsu.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class AgrInfoController {

    @Autowired
    AgrInfoServiceImpl agrInfoServiceImpl;

    @RequestMapping("/agrinfo-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getAgrInfoWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<AgrInfo> agrInfos = agrInfoServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(agrInfos, 5);
        return Msg.success().add("pageInfo", page);
    }

    //农产品保存
    @RequestMapping(value = "/agrinfo", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveAgrInfo(AgrInfo agrInfo) {
        agrInfoServiceImpl.saveAgrInfo(agrInfo);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }


    @RequestMapping(value = "/agrinfo/{agrid}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg updateAgrInfo(AgrInfo agrInfo, HttpServletRequest request) {
        agrInfoServiceImpl.updateAgrInfo(agrInfo);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    @RequestMapping(value = "/agrinfo/{agrids}", method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteAgrInfo(@PathVariable("agrids") String agrids) {
        //批量删除
        if (agrids.contains("-")) {
            List<String> del_ids = new ArrayList<>();
            String[] str_ids = agrids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(string);
            }
            agrInfoServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            agrInfoServiceImpl.deleteAgrInfo(agrids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    //根据ID查询
    @RequestMapping(value = "/agrinfo/{agrid}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getAgrInfo(@PathVariable("agrid") String agrid) {
        AgrInfo agrInfo = agrInfoServiceImpl.getAgrInfo(agrid);
        return Msg.success().add("agrInfo", agrInfo);
    }
}
