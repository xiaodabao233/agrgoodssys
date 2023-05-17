package com.nsu.service.impl;

import com.nsu.dao.LogDao;
import com.nsu.entity.Log;
import com.nsu.entity.LogExample;
import com.nsu.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    LogDao logDao;

    //查看所有日志信息
    @Override
    public List<Log> getAll() {
        return logDao.selectByExample(null);
    }

    //日志信息删除
    @Override
    public void deleteLog(Integer id) {
        logDao.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteBatch(List<Integer> ids) {
        LogExample example = new LogExample();
        LogExample.Criteria criteria = example.createCriteria();
        //delete from xxx where id in(1,2,3)
        criteria.andIdIn(ids);
        logDao.deleteByExample(example);
    }
}
