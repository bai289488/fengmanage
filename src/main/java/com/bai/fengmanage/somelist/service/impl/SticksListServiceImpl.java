package com.bai.fengmanage.somelist.service.impl;

import com.bai.fengmanage.somelist.entity.PlateList;
import com.bai.fengmanage.somelist.entity.SticksList;
import com.bai.fengmanage.somelist.mapper.PlateListMapper;
import com.bai.fengmanage.somelist.mapper.SticksListMapper;
import com.bai.fengmanage.somelist.service.PlateListService;
import com.bai.fengmanage.somelist.service.SticksListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
@Service
public class SticksListServiceImpl implements SticksListService {

    @Autowired
    private SticksListMapper sticksListMapper;

    @Override
    public List<SticksList> getLists(Integer parentid) {
        List<SticksList> lists = sticksListMapper.queryList(parentid);
        return lists;
    }
}
