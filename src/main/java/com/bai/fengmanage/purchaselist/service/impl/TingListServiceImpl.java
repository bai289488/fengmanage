package com.bai.fengmanage.purchaselist.service.impl;

import com.bai.fengmanage.purchaselist.entity.TingList;
import com.bai.fengmanage.purchaselist.mapper.TingListMapper;
import com.bai.fengmanage.purchaselist.service.TingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/19
 */
@Service
public class TingListServiceImpl implements TingListService {

    @Autowired
    private TingListMapper tingListMapper;

    @Override
    public List<TingList> getTingList(Integer parentid) {
        List<TingList> lists = tingListMapper.queryTingList(parentid);
        return lists;
    }
}
