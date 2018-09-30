package com.bai.fengmanage.log.service;

import com.bai.fengmanage.log.entity.Log;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/19
 */
public interface LogService {

    List<Log> getList();

    Integer insertList(Log log);

    Integer updateList(String results,Integer lid);
}
