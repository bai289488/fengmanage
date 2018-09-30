package com.bai.fengmanage.issuelist.service;

import com.bai.fengmanage.issuelist.entity.OutList;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/27
 */
public interface OutListService {

    List<OutList> getTingList(Integer parentid);
}
