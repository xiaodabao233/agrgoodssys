package com.nsu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsu.entity.Msg;
import com.nsu.entity.SeedInfo;
import com.nsu.service.impl.SeedInfoServiceImpl;
import com.nsu.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SeedInfoController {
    @Autowired
    SeedInfoServiceImpl seedInfoServiceImpl;

    @RequestMapping(value = "/seedinfo-list")
    @ResponseBody
    //pn:pagenumber，即当前页数
    public Msg getSeedInfoWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //pageSize：10，指每页显示的数据数
        PageHelper.startPage(pn, 10);
        List<SeedInfo> seedInfos = seedInfoServiceImpl.getAll();
        //navigatePages：5，指在页面需要连续显示的页码数
        PageInfo page = new PageInfo(seedInfos, 5);
        return Msg.success().add("pageInfo", page);
    }

    //保存
    @RequestMapping(value = "/seedinfo", method = RequestMethod.POST)
    @ResponseBody
    public Msg savaSeedInfo(SeedInfo seedInfo) {
        seedInfoServiceImpl.savaSeedInfo(seedInfo);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    //更新
    @RequestMapping(value = "/seedinfo/{seedid}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg updateSeedInfo(SeedInfo seedInfo, HttpServletRequest request) {
        seedInfoServiceImpl.updateSeedInfo(seedInfo);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    @RequestMapping(value = "/seedinfo/{seedids}", method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteSeedInfo(@PathVariable("seedids") String seedids) {
        //批量删除
        if (seedids.contains("-")) {
            List<String> del_ids = new ArrayList<>();
            String[] str_ids = seedids.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(string);
            }
            seedInfoServiceImpl.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            seedInfoServiceImpl.deleteSeedInfo(seedids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    //根据记录号查询
    @RequestMapping(value = "/seedinfo/{seedid}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getSeedInfo(@PathVariable("seedid") String seedid) {
        SeedInfo seedInfo = seedInfoServiceImpl.getSeedInfo(seedid);
        return Msg.success().add("seedInfo", seedInfo);
    }


}
