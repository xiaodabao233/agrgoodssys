package com.nsu.dao;

import com.nsu.entity.Crop;
import com.nsu.entity.CropExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CropDao {
    long countByExample(CropExample example);

    int deleteByExample(CropExample example);

    int deleteByPrimaryKey(String cropid);

    int insert(Crop row);

    int insertSelective(Crop row);

    List<Crop> selectByExample(CropExample example);

    Crop selectByPrimaryKey(String cropid);

    int updateByExampleSelective(@Param("row") Crop row, @Param("example") CropExample example);

    int updateByExample(@Param("row") Crop row, @Param("example") CropExample example);

    int updateByPrimaryKeySelective(Crop row);

    int updateByPrimaryKey(Crop row);
}