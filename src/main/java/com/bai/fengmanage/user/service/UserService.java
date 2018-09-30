package com.bai.fengmanage.user.service;

import com.bai.fengmanage.user.entity.User;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/12
 */
public interface UserService {

    User getByName(String name);

    Integer insertUser(User user);

    List<User> getList();
}
