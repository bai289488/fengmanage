package com.bai.fengmanage.somelist.service.impl;

import com.bai.fengmanage.somelist.entity.DishList;
import com.bai.fengmanage.somelist.entity.PlateList;
import com.bai.fengmanage.somelist.mapper.DishListMapper;
import com.bai.fengmanage.somelist.mapper.PlateListMapper;
import com.bai.fengmanage.somelist.service.DishListService;
import com.bai.fengmanage.somelist.service.PlateListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
@Service
public class PlateListServiceImpl implements PlateListService {

    @Autowired
    private PlateListMapper plateListMapper;

    @Override
    public List<PlateList> getLists(Integer parentid) {
        List<PlateList> lists = plateListMapper.queryList(parentid);
        return lists;
    }
}
