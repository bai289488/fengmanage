package com.bai.fengmanage.somelist.service;

import com.bai.fengmanage.somelist.entity.DeskList;
import com.bai.fengmanage.somelist.entity.DishList;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
public interface DishListService {

    List<DishList> getList(Integer parentid);
}
