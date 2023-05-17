package com.nsu.service.impl;

import com.nsu.dao.AgrSalesDao;
import com.nsu.entity.AgrSales;
import com.nsu.entity.AgrSalesExample;
import com.nsu.service.AgrSalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AgrSalesServiceImpl implements AgrSalesService {
    @Autowired
    AgrSalesDao agrSalesDao;

    @Override
    public List<AgrSales> getAll() {
//        agrSalesDao.synchronize();
        return agrSalesDao.selectByExample(null);
    }

    @Override
    public void saveAgrSales(AgrSales agrSales) {
        agrSalesDao.insertSelective(agrSales);
    }

    @Override
    public void deleteBatch(List<String> agroutids) {
        AgrSalesExample example = new AgrSalesExample();
        AgrSalesExample.Criteria criteria = example.createCriteria();
        criteria.andAgroutidIn(agroutids);
        agrSalesDao.deleteByExample(example);

    }

    @Override
    public void deleteAgrSales(String agroutid) {
        agrSalesDao.deleteByPrimaryKey(agroutid);
    }

    @Override
    public AgrSales getAgrSales(String agroutid) {
        AgrSales agrSales = agrSalesDao.selectByPrimaryKey(agroutid);
        return agrSales;
    }

    @Override
    public void updateAgrSales(AgrSales agrSales) {
        agrSalesDao.updateByPrimaryKeySelective(agrSales);
    }
}
