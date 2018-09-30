package com.bai.fengmanage.badlist.service;

import com.bai.fengmanage.badlist.entity.BadList;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/17
 */
public interface BadListService {

    List<BadList> getList(Integer btype);

    BadList getById(Integer bid);

    Integer insertList(BadList badList);

    Integer updateList(BadList badList);

    Integer deleteList(String[] bids);
}
