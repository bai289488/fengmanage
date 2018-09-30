package com.bai.fengmanage.purchaselist.service;

import com.bai.fengmanage.purchaselist.entity.TingList;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/19
 */
public interface TingListService {

    List<TingList> getTingList(Integer parentid);
}
