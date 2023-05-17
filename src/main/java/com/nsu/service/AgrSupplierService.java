package com.nsu.service;

import com.nsu.entity.AgrSupplier;

import java.util.List;

public interface AgrSupplierService {
    //查询所有
    public List<AgrSupplier> getAll();

    //保存
    public void saveAgrSupplier(AgrSupplier agrSupplier);

    //删除
    public void deleteAgrSupplier(String supplierid);

    //更新
    public void updateAgrSupplier(AgrSupplier agrSupplier);

    //删除选中
    public void deleteBatch(List<String> supplierids);

    //根据ID查询
    public AgrSupplier getAgrSupplier(String supplierid);
}
