package com.nsu.service;

import com.nsu.entity.AgrSales;

import java.util.List;

public interface AgrSalesService {
    //返回所有
    List<AgrSales> getAll();

    //保存
    void saveAgrSales(AgrSales agrSales);

    //删除
    void deleteBatch(List<String> del_agroutids);

    void deleteAgrSales(String agroutid);

    //根据ID查询
    AgrSales getAgrSales(String agroutid);

    //更新
    void updateAgrSales(AgrSales agrSales);
}
