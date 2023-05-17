package com.nsu.dao;

import com.nsu.entity.AgrSales;
import com.nsu.entity.AgrSalesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgrSalesDao {
    long countByExample(AgrSalesExample example);

    int deleteByExample(AgrSalesExample example);

    int deleteByPrimaryKey(String agroutid);

    int insert(AgrSales row);

    int insertSelective(AgrSales row);

    List<AgrSales> selectByExample(AgrSalesExample example);

    AgrSales selectByPrimaryKey(String agroutid);

    int updateByExampleSelective(@Param("row") AgrSales row, @Param("example") AgrSalesExample example);

    int updateByExample(@Param("row") AgrSales row, @Param("example") AgrSalesExample example);

    int updateByPrimaryKeySelective(AgrSales row);

    int updateByPrimaryKey(AgrSales row);
}