package com.nsu.service;

import com.nsu.entity.Dealer;

import java.util.List;

public interface DealerService {
    //查询所有
    List<Dealer> getAll();

    //保存
    void saveDealer(Dealer dealer);

    //删除
    void deleteBatch(List<String> del_distributorids);

    void deleteDealer(String distributorid);

    //更新
    void updateDealer(Dealer dealer);

    //根据ID查询
    Dealer getDealer(String distributorid);
}
