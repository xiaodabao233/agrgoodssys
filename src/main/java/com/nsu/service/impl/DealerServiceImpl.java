package com.nsu.service.impl;

import com.nsu.dao.DealerDao;
import com.nsu.entity.Dealer;
import com.nsu.entity.DealerExample;
import com.nsu.service.DealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DealerServiceImpl implements DealerService {
    @Autowired
    DealerDao dealerDao;

    @Override
    public List<Dealer> getAll() {
        return dealerDao.selectByExample(null);
    }

    @Override
    public void saveDealer(Dealer dealer) {
dealerDao.insertSelective(dealer);
    }

    @Override
    public void deleteBatch(List<String> distributorids) {
        DealerExample example = new DealerExample();
        DealerExample.Criteria criteria = example.createCriteria();
        criteria.andDistributoraddressIn(distributorids);
        dealerDao.deleteByExample(example);
    }

    @Override
    public void deleteDealer(String distributorid) {
dealerDao.deleteByPrimaryKey(distributorid);
    }

    @Override
    public void updateDealer(Dealer dealer) {
dealerDao.updateByPrimaryKeySelective(dealer);
    }

    @Override
    public Dealer getDealer(String distributorid) {
        Dealer dealer = dealerDao.selectByPrimaryKey(distributorid);
        return dealer;
    }
}
