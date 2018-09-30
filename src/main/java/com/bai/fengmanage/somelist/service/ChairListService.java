package com.bai.fengmanage.somelist.service;

import com.bai.fengmanage.somelist.entity.ChairList;
import com.bai.fengmanage.somelist.entity.DeskList;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
public interface ChairListService {

    List<ChairList> getList(Integer parentid);
}
