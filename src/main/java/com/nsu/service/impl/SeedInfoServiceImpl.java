package com.nsu.service.impl;

import com.nsu.dao.SeedInfoDao;
import com.nsu.entity.SeedInfo;
import com.nsu.entity.SeedInfoExample;
import com.nsu.service.SeedInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SeedInfoServiceImpl implements SeedInfoService {
    @Autowired
    SeedInfoDao seedInfoDao;

    @Override
    public List<SeedInfo> getAll() {
//        seedInfoDao.synchronize();
        return seedInfoDao.selectByExample(null);
    }

    @Override
    public void savaSeedInfo(SeedInfo seedInfo) {
        seedInfoDao.insertSelective(seedInfo);
    }

    @Override
    public void deleteSeedInfo(String seedid) {
    seedInfoDao.deleteByPrimaryKey(seedid);
    }

    @Override
    public void deleteBatch(List<String> seedids) {
        SeedInfoExample example = new SeedInfoExample();
        SeedInfoExample.Criteria criteria = example.createCriteria();
//        criteria.andIdIn(seedids);
        criteria.andSeedidIn(seedids);
        seedInfoDao.deleteByExample(example);
    }

    @Override
    public SeedInfo getSeedInfo(String seedid) {
        SeedInfo seedInfo = seedInfoDao.selectByPrimaryKey(seedid);
        return seedInfo;
    }

    @Override
    public void updateSeedInfo(SeedInfo seedInfo) {
        seedInfoDao.updateByPrimaryKeySelective(seedInfo);
    }
}
