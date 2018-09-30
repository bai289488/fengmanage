package com.bai.fengmanage.somelist.service.impl;

import com.bai.fengmanage.somelist.entity.ChairList;
import com.bai.fengmanage.somelist.entity.DeskList;
import com.bai.fengmanage.somelist.mapper.ChairListMapper;
import com.bai.fengmanage.somelist.mapper.DeskListMapper;
import com.bai.fengmanage.somelist.service.ChairListService;
import com.bai.fengmanage.somelist.service.DeskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
@Service
public class ChairListServiceImpl implements ChairListService {

    @Autowired
    private ChairListMapper chairListMapper;

    @Override
    public List<ChairList> getList(Integer parentid) {
        List<ChairList> lists = chairListMapper.queryList(parentid);
        return lists;
    }
}
