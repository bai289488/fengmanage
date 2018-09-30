package com.bai.fengmanage.somelist.service.impl;

import com.bai.fengmanage.somelist.entity.DeskList;
import com.bai.fengmanage.somelist.mapper.DeskListMapper;
import com.bai.fengmanage.somelist.service.DeskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
@Service
public class DeskListServiceImpl implements DeskListService {

    @Autowired
    private DeskListMapper deskListMapper;

    @Override
    public List<DeskList> getList(Integer parentid) {
        List<DeskList> lists = deskListMapper.queryList(parentid);
        return lists;
    }
}
