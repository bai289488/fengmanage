package com.bai.fengmanage.somelist.service.impl;

import com.bai.fengmanage.somelist.entity.DeskList;
import com.bai.fengmanage.somelist.entity.DishList;
import com.bai.fengmanage.somelist.mapper.DeskListMapper;
import com.bai.fengmanage.somelist.mapper.DishListMapper;
import com.bai.fengmanage.somelist.service.DeskListService;
import com.bai.fengmanage.somelist.service.DishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
@Service
public class DishListServiceImpl implements DishListService {

    @Autowired
    private DishListMapper dishListMapper;

    @Override
    public List<DishList> getList(Integer parentid) {
        List<DishList> lists = dishListMapper.queryList(parentid);
        return lists;
    }
}
