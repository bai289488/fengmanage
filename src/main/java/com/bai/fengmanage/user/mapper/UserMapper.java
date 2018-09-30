package com.bai.fengmanage.user.mapper;

import com.bai.fengmanage.user.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/12
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where name = #{name}")
    User queryByName(String name);

    @Insert("insert into user(name,password) values(#{name},#{password})")
    Integer addUser(User user);

    @Select("select * from user")
    List<User> queryList();

}
