package com.bai.fengmanage.somelist.mapper;

import com.bai.fengmanage.somelist.entity.SticksList;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
@Mapper
public interface SticksListMapper {

    @Select("select * from stickslist where parentid = #{parentid}")
    List<SticksList> queryList(Integer parentid);

    @Insert("insert into stickslist(sticksname,stickspic,stickstime,contenturl,sticksnumber,sticksdetail," +
            "sticksfrom,parentid) values (#{sticksname},#{stickspic},#{stickstime}," +
            "#{contenturl},#{sticksnumber},#{sticksdetail},#{sticksfrom},11)")
    Integer addsticks(SticksList sticksList);

    @Select("select * from stickslist where sticksname = #{sticksname} and parentid = #{parentid}")
    SticksList queryByName(@Param("sticksname")String sticksname, @Param("parentid")Integer parentid);

    @Update("update stickslist set sticksname=#{sticksname},stickspic=#{stickspic},sticksnumber=#{sticksnumber}," +
            "stickstime=#{stickstime},sticksdetail=#{sticksdetail},sticksfrom=#{sticksfrom},parentid=11 where sticksid=#{sticksid}" )
    Integer updateSticks(SticksList sticksList);
}
