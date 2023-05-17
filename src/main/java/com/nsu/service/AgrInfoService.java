package com.nsu.service;

import com.nsu.entity.AgrInfo;

import java.util.List;

public interface AgrInfoService {
    //查询所有
    public List<AgrInfo> getAll();

    //保存
    public void saveItems(AgrInfo agrInfo);

    //删除
    public void deleteAgrInfo(String agrid);

    public void deleteBatch(List<String> agrids);

    //更新
    void updateAgrInfo(AgrInfo agrInfo);

    //根据ID查询
    AgrInfo getAgrInfo(String agrid);
}
