package com.bai.fengmanage.somelist.service;

import com.bai.fengmanage.somelist.entity.DishList;
import com.bai.fengmanage.somelist.entity.PlateList;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
public interface PlateListService {

    List<PlateList> getLists(Integer parentid);
}
