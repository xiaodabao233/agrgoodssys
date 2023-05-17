package com.nsu.dao;

import com.nsu.entity.AgrInfo;
import com.nsu.entity.AgrInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgrInfoDao {
    long countByExample(AgrInfoExample example);

    int deleteByExample(AgrInfoExample example);

    int deleteByPrimaryKey(String agrid);

    int insert(AgrInfo row);

    int insertSelective(AgrInfo row);

    List<AgrInfo> selectByExample(AgrInfoExample example);

    AgrInfo selectByPrimaryKey(String agrid);

    int updateByExampleSelective(@Param("row") AgrInfo row, @Param("example") AgrInfoExample example);

    int updateByExample(@Param("row") AgrInfo row, @Param("example") AgrInfoExample example);

    int updateByPrimaryKeySelective(AgrInfo row);

    int updateByPrimaryKey(AgrInfo row);
}