package com.nsu.dao;

import com.nsu.entity.Dealer;
import com.nsu.entity.DealerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealerDao {
    long countByExample(DealerExample example);

    int deleteByExample(DealerExample example);

    int deleteByPrimaryKey(String distributorid);

    int insert(Dealer row);

    int insertSelective(Dealer row);

    List<Dealer> selectByExample(DealerExample example);

    Dealer selectByPrimaryKey(String distributorid);

    int updateByExampleSelective(@Param("row") Dealer row, @Param("example") DealerExample example);

    int updateByExample(@Param("row") Dealer row, @Param("example") DealerExample example);

    int updateByPrimaryKeySelective(Dealer row);

    int updateByPrimaryKey(Dealer row);
}