package com.bai.fengmanage.log.service.impl;

import com.bai.fengmanage.log.entity.Log;
import com.bai.fengmanage.log.mapper.LogMapper;
import com.bai.fengmanage.log.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/19
 */
@Service
public class LogServiceImpl implements LogService{

    @Autowired
    private LogMapper logMapper;

    @Override
    public List<Log> getList() {
        List<Log> logs = logMapper.queryList();
        return logs;
    }

    @Override
    public Integer insertList(Log log) {
        Integer list = logMapper.addList(log);
        return list;
    }

    @Override
    public Integer updateList(String results, Integer lid) {
        Integer list = logMapper.updateList(results, lid);
        return list;
    }
}
