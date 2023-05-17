package com.nsu.service.impl;

import com.nsu.dao.AgrSupplierDao;
import com.nsu.entity.AgrSupplier;
import com.nsu.entity.AgrSupplierExample;
import com.nsu.service.AgrSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AgrSupplierServiceImpl implements AgrSupplierService {
    @Autowired
    AgrSupplierDao agrSupplierDao;

    @Override
    public List<AgrSupplier> getAll() {
        return agrSupplierDao.selectByExample(null);
    }

    @Override
    public void saveAgrSupplier(AgrSupplier agrSupplier) {
        agrSupplierDao.insertSelective(agrSupplier);
    }

    @Override
    public void deleteAgrSupplier(String supplierid) {
        agrSupplierDao.deleteByPrimaryKey(supplierid);
    }

    @Override
    public void updateAgrSupplier(AgrSupplier agrSupplier) {
        agrSupplierDao.updateByPrimaryKeySelective(agrSupplier);
    }

    @Override
    public void deleteBatch(List<String> supplierids) {
        AgrSupplierExample example = new AgrSupplierExample();
        AgrSupplierExample.Criteria criteria = example.createCriteria();
        criteria.andSupplieraddressIn(supplierids);
        agrSupplierDao.deleteByExample(example);
    }

    @Override
    public AgrSupplier getAgrSupplier(String supplierid) {
        AgrSupplier agrSupplier = agrSupplierDao.selectByPrimaryKey(supplierid);
        return agrSupplier;
    }
}
