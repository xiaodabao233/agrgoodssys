package com.nsu.service.impl;

import com.nsu.dao.CropDao;
import com.nsu.entity.Crop;
import com.nsu.entity.CropExample;
import com.nsu.service.CropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CropServiceImpl implements CropService {
    @Autowired
    CropDao cropDao;

    //查询所有
    @Override
    public List<Crop> getAll() {
        return cropDao.selectByExample(null);
    }

    //保存
    @Override
    public void saveCrop(Crop crop) {
        cropDao.insertSelective(crop);
    }

    @Override
    public void deleteCrop(String cropid) {
        cropDao.deleteByPrimaryKey(cropid);
    }

    @Override
    public void deleteBatch(List<String> cropids) {
        CropExample example = new CropExample();
        CropExample.Criteria criteria = example.createCriteria();
        criteria.andLandidIn(cropids);
        cropDao.deleteByExample(example);
    }

    @Override
    public void updateCrop(Crop crop) {
        cropDao.updateByPrimaryKeySelective(crop);
    }
    @Override
    public Crop getCrop(String cropid) {
        Crop crop = cropDao.selectByPrimaryKey(cropid);
        return crop;
    }
}
