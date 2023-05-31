package com.nsu.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nsu.entity.Crop;
import com.nsu.entity.Msg;
import com.nsu.service.CropService;
import com.nsu.util.LogUtil;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CropController {

    @Autowired
    CropService cropService;


    @RequestMapping("/crop-list")
    @ResponseBody
    public Msg getCropWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model) {
        PageHelper.startPage(pn, 10);
        List<Crop> crops = cropService.getAll();

        PageInfo page = new PageInfo(crops, 5);
        return Msg.success().add("pageInfo", page);
    }

    @RequestMapping(value = "/crop", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveCrop(Crop crop) {
        cropService.saveCrop(crop);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    @RequestMapping(value = "/crop/{cropid}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg updateCrop(Crop crop, HttpServletRequest request) {
        cropService.updateCrop(crop);
        LogUtil.writeLogs(this.getClass().getName(),
                Thread.currentThread().getStackTrace()[1].getMethodName(),
                "");
        return Msg.success();
    }

    @RequestMapping(value = "/crop/{cropids}", method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteCrop(@PathVariable("cropids") String crops) {
        //批量删除
        if (crops.contains("-")) {
            List<String> del_ids = new ArrayList<>();
            String[] str_ids = crops.split("-");
            //组装id的集合
            for (String string : str_ids) {
                del_ids.add(string);
            }
            cropService.deleteBatch(del_ids);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        } else {
            cropService.deleteCrop(crops);
            LogUtil.writeLogs(this.getClass().getName(),
                    Thread.currentThread().getStackTrace()[1].getMethodName(),
                    "");
        }
        return Msg.success();
    }

    @RequestMapping(value = "/crop/{cropid}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getCrop(@PathVariable("cropid") String cropid) {

        Crop crop = cropService.getCrop(cropid);
        return Msg.success().add("crop", crop);
    }

    //查出所有
    @RequestMapping(value = "/crops", method = RequestMethod.GET)
    @ResponseBody
    public Msg getCrops() {
        List<Crop> list = cropService.getAll();
        return Msg.success().add("crops", list);
    }
}
