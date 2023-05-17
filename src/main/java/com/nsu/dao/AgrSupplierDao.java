package com.nsu.dao;

import com.nsu.entity.AgrSupplier;
import com.nsu.entity.AgrSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgrSupplierDao {
    long countByExample(AgrSupplierExample example);

    int deleteByExample(AgrSupplierExample example);

    int deleteByPrimaryKey(String supplierid);

    int insert(AgrSupplier row);

    int insertSelective(AgrSupplier row);

    List<AgrSupplier> selectByExample(AgrSupplierExample example);

    AgrSupplier selectByPrimaryKey(String supplierid);

    int updateByExampleSelective(@Param("row") AgrSupplier row, @Param("example") AgrSupplierExample example);

    int updateByExample(@Param("row") AgrSupplier row, @Param("example") AgrSupplierExample example);

    int updateByPrimaryKeySelective(AgrSupplier row);

    int updateByPrimaryKey(AgrSupplier row);
}