package com.bai.fengmanage.somelist.service;

import com.bai.fengmanage.somelist.entity.DeskList;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
public interface DeskListService {

    List<DeskList> getList(Integer parentid);
}
