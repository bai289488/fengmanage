package com.bai.fengmanage.issuelist.service.impl;

import com.bai.fengmanage.issuelist.entity.OutList;
import com.bai.fengmanage.issuelist.mapper.OutListMapper;
import com.bai.fengmanage.issuelist.service.OutListService;
import com.bai.fengmanage.purchaselist.entity.TingList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/27
 */
@Service
public class OutListServiceImpl implements OutListService {

    @Autowired
    private OutListMapper outListMapper;


    @Override
    public List<OutList> getTingList(Integer parentid) {
        List<OutList> lists = outListMapper.queryTingList(parentid);
        return lists;
    }
}
