package com.bai.fengmanage.menu.service.impl;

import com.bai.fengmanage.menu.entity.ClassfiyMenu;
import com.bai.fengmanage.menu.mapper.ClassfiyMenuMapper;
import com.bai.fengmanage.menu.service.ClassfiyMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/13
 */
@Service
public class ClassfiyMenuServiceImpl implements ClassfiyMenuService {

    @Autowired
    private ClassfiyMenuMapper classfiyMenuMapper;


    @Override
    public List<ClassfiyMenu> getList(Integer parentsId) {
        List<ClassfiyMenu> menus = classfiyMenuMapper.queryList(parentsId);
        return menus;
    }
}
