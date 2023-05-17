package com.nsu.service;

import com.nsu.entity.LandInfo;

import java.util.List;

public interface LandInfoService {

    //所有
    public List<LandInfo> getAll();

    //保存
    public void saveLandInfo(LandInfo landInfo);

    //菜地保存
    public void deleteLandInfo(String landid);
    public void deleteBatch(List<String> landids);

    //菜地保存
    public void updateLandInfo(LandInfo landInfo);

    //根据ID查询菜地
    public LandInfo getLandInfo(String landid);
}
