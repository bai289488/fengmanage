package com.bai.fengmanage.badlist.service.impl;

import com.bai.fengmanage.badlist.entity.BadList;
import com.bai.fengmanage.badlist.mapper.BadListMapper;
import com.bai.fengmanage.badlist.service.BadListService;
import com.bai.fengmanage.common.AopRegis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/17
 */
@Service
public class BadListServiceImpl implements BadListService {

    @Autowired
    private BadListMapper badListMapper;

    @Override
    public List<BadList> getList(Integer btype) {
        List<BadList> lists = badListMapper.queryList(btype);
        return lists;
    }

    @Override
    public BadList getById(Integer bid) {
        BadList badList = badListMapper.queryById(bid);
        return badList;
    }

    @AopRegis(description = "添加损坏事物")
    @Override
    public Integer insertList(BadList badList) {
        Integer list = badListMapper.addList(badList);
        return list;
    }

    @AopRegis(description = "修改损坏事物")
    @Override
    public Integer updateList(BadList badList) {
        Integer list = badListMapper.updateList(badList);
        return list;
    }

    @AopRegis(description = "删除损坏事物")
    @Override
    public Integer deleteList(String[] bid) {
        Integer result = null;
        for(String b:bid){
            result = badListMapper.removeList(Integer.parseInt(b));
        }
        return result;
    }
}
