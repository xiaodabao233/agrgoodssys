package com.nsu.dao;

import com.nsu.entity.SeedInfo;
import com.nsu.entity.SeedInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeedInfoDao {
    long countByExample(SeedInfoExample example);

    int deleteByExample(SeedInfoExample example);

    int deleteByPrimaryKey(String seedid);

    int insert(SeedInfo row);

    int insertSelective(SeedInfo row);

    List<SeedInfo> selectByExample(SeedInfoExample example);

    SeedInfo selectByPrimaryKey(String seedid);

    int updateByExampleSelective(@Param("row") SeedInfo row, @Param("example") SeedInfoExample example);

    int updateByExample(@Param("row") SeedInfo row, @Param("example") SeedInfoExample example);

    int updateByPrimaryKeySelective(SeedInfo row);

    int updateByPrimaryKey(SeedInfo row);
}