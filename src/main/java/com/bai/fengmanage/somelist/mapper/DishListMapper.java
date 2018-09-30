package com.bai.fengmanage.somelist.mapper;

import com.bai.fengmanage.somelist.entity.ChairList;
import com.bai.fengmanage.somelist.entity.DishList;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
@Mapper
public interface DishListMapper {

    @Select("select * from dishlist where parentid = #{parentid}")
    List<DishList> queryList(Integer parentid);

    @Insert("insert into dishlist(dishname,dishpic,dishtime,contenturl,dishnumber,dishdetail," +
            "dishfrom,parentid) values (#{dishname},#{dishpic},#{dishtime}," +
            "#{contenturl},#{dishnumber},#{dishdetail},#{dishfrom},9)")
    Integer addDish(DishList dishList);

    @Select("select * from dishlist where dishname = #{dishname} and parentid = #{parentid}")
    DishList queryByName(@Param("dishname")String dishname, @Param("parentid")Integer parentid);

    @Update("update dishlist set dishname=#{dishname},dishpic=#{dishpic},dishnumber=#{dishnumber}," +
            "dishtime=#{dishtime},dishdetail=#{dishdetail},dishfrom=#{dishfrom},parentid=9 where dishid=#{dishid}" )
    Integer updatedish(DishList dishList);

}
