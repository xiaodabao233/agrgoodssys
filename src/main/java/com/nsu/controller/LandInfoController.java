package com.nsu.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsu.entity.LandInfo;
import com.nsu.entity.Msg;
import com.nsu.service.impl.CropServiceImpl;
import com.nsu.service.impl.LandInfoServiceImpl;
import com.nsu.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class LandInfoController {
    @Autowired
    LandInfoServiceImpl landInfoServiceImpl;

    @RequestMapping("/landinfo-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getLandInfosWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<LandInfo> landInfos = landInfoServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(landInfos, 5);
        return Msg.success().add("pageInfo", page);
    }

    //保存地块
    @RequestMapping(value = "/landinfo", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveLandInfo(LandInfo landInfo) {
        landInfoServiceImpl.saveLandInfo(landInfo);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    //地块更新
    @ResponseBody
    @RequestMapping(value = "/landinfo/{id}", method = RequestMethod.PUT)
    public Msg updateLandInfo(LandInfo landInfo, HttpServletRequest request) {
        landInfoServiceImpl.updateLandInfo(landInfo);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    @ResponseBody
    @RequestMapping(value = "/landinfo/{landid}", produces = "text/html;charset=UTF-8", method = RequestMethod.POST)
    public String recommendPlan(@PathVariable("landid") String landid, Model model, HttpSession session, HttpServletRequest request) {
        return "";
    }

    @ResponseBody
    @RequestMapping(value = "/landinfo/{landids}", method = RequestMethod.DELETE)
    public Msg deleteLandInfo(@PathVariable("landids") String landids) {
        //批量删除
        if (landids.contains("-")) {
            List<Integer> del_ids = new ArrayList<>();
            String[] str_ids = landids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(Integer.parseInt(string));
            }
            landInfoServiceImpl.deleteBatch(Collections.singletonList(landids));
//            landInfoServiceImpl.deleteBatch(del_landids);
            LogUtil.writeLogs(this.getClass().getName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "");
        } else {
            Integer id = Integer.parseInt(landids);
            landInfoServiceImpl.deleteLandInfo(landids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    //根据id查询
    @RequestMapping(value = "/landinfo/{landid}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getLandInfo(@PathVariable("landid") String landid) {
        LandInfo landInfo = landInfoServiceImpl.getLandInfo(landid);
        return Msg.success().add("landinfo", landInfo);
    }

    //查出所有菜地信息
    @RequestMapping("/landinfos")
    @ResponseBody
    public Msg getLandInfo() {
        List<LandInfo> list = landInfoServiceImpl.getAll();
        return Msg.success().add("landinfo", list);
    }


}
