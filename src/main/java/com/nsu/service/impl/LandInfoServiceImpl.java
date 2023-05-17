package com.nsu.service.impl;

import com.nsu.dao.LandInfoDao;
import com.nsu.entity.LandInfo;
import com.nsu.entity.LandInfoExample;
import com.nsu.service.LandInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class LandInfoServiceImpl implements LandInfoService {
    @Autowired
    LandInfoDao landInfoDao;

    //查询所有
    public List<LandInfo> getAll() {
//        LandInfoDao.synchronize();
        return landInfoDao.selectByExample(null);
    }

    //菜地保存
    public void saveLandInfo(LandInfo landInfo) {
        landInfoDao.insertSelective(landInfo);
    }

    //菜地删除
    public void deleteLandInfo(String landid) {
        landInfoDao.deleteByPrimaryKey(landid);
    }

    @Override
    public void deleteBatch(List<String> landids) {
        LandInfoExample example = new LandInfoExample();
        LandInfoExample.Criteria criteria = example.createCriteria();
        criteria.andLandidIn(landids);
        landInfoDao.deleteByExample(example);
    }

    //菜地更新
    @Override
    public void updateLandInfo(LandInfo landInfo) {
        landInfoDao.updateByPrimaryKeySelective(landInfo);
    }

    //根据id查询菜地
    @Override
    public LandInfo getLandInfo(String landid) {
        LandInfo landInfo = landInfoDao.selectByPrimaryKey(landid);
        return landInfo;
    }
}
