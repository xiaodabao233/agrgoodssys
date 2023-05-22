package com.nsu.service.impl;

import com.nsu.dao.AgrInfoDao;
import com.nsu.entity.AgrInfo;
import com.nsu.entity.AgrInfoExample;
import com.nsu.service.AgrInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AgrInfoServiceImpl implements AgrInfoService {
    @Autowired
    AgrInfoDao agrInfoDao;

    @Override
    public List<AgrInfo> getAll() {
        return agrInfoDao.selectByExample(null);
    }

    @Override
    public void saveAgrInfo(AgrInfo agrInfo) {
        agrInfoDao.insertSelective(agrInfo);
    }

    @Override
    public void deleteAgrInfo(String agrid) {
        agrInfoDao.deleteByPrimaryKey(agrid);
    }

    @Override
    public void deleteBatch(List<String> agrids) {
        AgrInfoExample example = new AgrInfoExample();
        AgrInfoExample.Criteria criteria= example.createCriteria();
        criteria.andAgridIn(agrids);
        agrInfoDao.deleteByExample(example);
    }

    @Override
    public void updateAgrInfo(AgrInfo agrInfo) {
        agrInfoDao.updateByPrimaryKeySelective(agrInfo);
    }

    @Override
    public AgrInfo getAgrInfo(String agrid) {
        AgrInfo agrInfo = agrInfoDao.selectByPrimaryKey(agrid);
        return agrInfo;
    }
}
