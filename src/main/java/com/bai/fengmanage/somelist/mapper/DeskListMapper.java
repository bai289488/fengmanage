package com.bai.fengmanage.somelist.mapper;

import com.bai.fengmanage.somelist.entity.DeskList;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
@Mapper
public interface DeskListMapper {

    @Select("select * from desklist where parentid = #{parentid}")
    List<DeskList> queryList(Integer parentid);

    @Insert("insert into desklist(deskname,deskpic,desktime," +
            "desknumber,deskdetail,contenturl," +
            "deskfrom, ) values (#{deskname},#{deskpic}," +
            "#{desktime},#{desknumber},#{deskdetail}," +
            "#{contenturl},#{deskfrom},7)")
    Integer addDeskList(DeskList deskList);

    @Select("select * from desklist where deskname = #{deskname} and parentid = #{parentid}")
    DeskList queryByName(@Param("deskname")String deskname,@Param("parentid")Integer parentid);

    @Update("update desklist set " +
            "deskname=#{deskname},deskpic=#{deskpic},desktime=#{desktime},desknumber=#{desknumber},deskdetail=#{deskdetail}" +
            "contenturl=#{contenturl},deskfrom=#{deskfrom},parentid=7 where deskid=#{deskid}")
    Integer updateDesk(DeskList deskList);
}
