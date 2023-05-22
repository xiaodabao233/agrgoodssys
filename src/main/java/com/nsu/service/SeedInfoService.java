package com.nsu.service;

import com.nsu.entity.SeedInfo;

import java.util.List;

public interface SeedInfoService {
    //返回所有的种植信息
    List<SeedInfo> getAll();

    //种植信息保存
    void savaSeedInfo(SeedInfo seedInfo);

    //种植信息删除
    void deleteSeedInfo(String seedid);

    void deleteBatch(List<String> del_seedids);

    //根据id号查询种植信息
    SeedInfo getSeedInfo(String seedid);

    //种植信息更新
    void updateSeedInfo(SeedInfo seedInfo);
}
