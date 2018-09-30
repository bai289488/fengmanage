package com.bai.fengmanage.user.service.impl;

import com.bai.fengmanage.user.entity.User;
import com.bai.fengmanage.user.mapper.UserMapper;
import com.bai.fengmanage.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/12
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getByName(String name) {
        User user = userMapper.queryByName(name);
        return user;
    }

    @Override
    public Integer insertUser(User user) {
        Integer result = userMapper.addUser(user);
        return result;
    }

    @Override
    public List<User> getList() {
        List<User> list = userMapper.queryList();
        return list;
    }
}
