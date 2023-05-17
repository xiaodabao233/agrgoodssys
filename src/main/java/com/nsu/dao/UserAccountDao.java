package com.nsu.dao;

import com.nsu.entity.UserAccount;
import com.nsu.entity.UserAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountDao {
    long countByExample(UserAccountExample example);

    int deleteByExample(UserAccountExample example);

    int deleteByPrimaryKey(String uid);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    List<UserAccount> selectByExample(UserAccountExample example);

    UserAccount selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("row") UserAccount row, @Param("example") UserAccountExample example);

    int updateByExample(@Param("row") UserAccount record, @Param("example") UserAccountExample example);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount row);

    UserAccount selectByUaccount(String uaccount);

    int changeStatus(UserAccount record);
}