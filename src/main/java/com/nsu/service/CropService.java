package com.nsu.service;

import com.nsu.entity.Crop;

import java.util.List;

public interface CropService {
    //查询所有农作物信息
    public List<Crop> getAll();

    //农作物保存
    public void saveCrop(Crop crops);

    //农作物删除
    public void deleteCrop(String cropid);

    //农作物更新
    public void updateCrop(Crop crop);

    public void deleteBatch(List<String> cropids);

    //根据ID查询农作物
    public Crop getCrops(String cropid);
}
