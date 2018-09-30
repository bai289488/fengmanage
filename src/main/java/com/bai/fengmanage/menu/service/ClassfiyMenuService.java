package com.bai.fengmanage.menu.service;

import com.bai.fengmanage.menu.entity.ClassfiyMenu;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/13
 */
public interface ClassfiyMenuService {

    List<ClassfiyMenu> getList(Integer parentsId);
}
