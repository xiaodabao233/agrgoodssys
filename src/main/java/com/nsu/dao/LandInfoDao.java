package com.nsu.dao;

import com.nsu.entity.LandInfo;
import com.nsu.entity.LandInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LandInfoDao {
    long countByExample(LandInfoExample example);

    int deleteByExample(LandInfoExample example);

    int deleteByPrimaryKey(String landid);

    int insert(LandInfo row);

    int insertSelective(LandInfo row);

    List<LandInfo> selectByExample(LandInfoExample example);

    LandInfo selectByPrimaryKey(String landid);

    int updateByExampleSelective(@Param("row") LandInfo row, @Param("example") LandInfoExample example);

    int updateByExample(@Param("row") LandInfo row, @Param("example") LandInfoExample example);

    int updateByPrimaryKeySelective(LandInfo row);

    int updateByPrimaryKey(LandInfo row);

//     void synchronize();
}