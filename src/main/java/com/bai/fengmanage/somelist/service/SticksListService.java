package com.bai.fengmanage.somelist.service;

import com.bai.fengmanage.somelist.entity.PlateList;
import com.bai.fengmanage.somelist.entity.SticksList;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
public interface SticksListService {

    List<SticksList> getLists(Integer parentid);
}
