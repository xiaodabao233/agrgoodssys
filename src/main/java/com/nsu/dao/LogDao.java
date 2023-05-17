package com.nsu.dao;

import com.nsu.entity.Log;
import com.nsu.entity.LogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogDao {
    long countByExample(LogExample example);

    int deleteByExample(LogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Log row);

    int insertSelective(Log row);

    List<Log> selectByExample(LogExample example);

    Log selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Log row, @Param("example") LogExample example);

    int updateByExample(@Param("row") Log row, @Param("example") LogExample example);

    int updateByPrimaryKeySelective(Log row);

    int updateByPrimaryKey(Log row);
}