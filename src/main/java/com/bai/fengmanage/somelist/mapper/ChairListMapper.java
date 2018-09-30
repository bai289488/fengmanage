package com.bai.fengmanage.somelist.mapper;

import com.bai.fengmanage.somelist.entity.ChairList;
import com.bai.fengmanage.somelist.entity.DeskList;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
@Mapper
public interface ChairListMapper {

    @Select("select * from chairlist where parentid = #{parentid}")
    List<ChairList> queryList(Integer parentid);

    @Insert("insert into chairlist(chairname,chairpic," +
            "chairnumber,chairtime," +
            "chairdetail,chairfrom," +
            "parentid) values(#{chairname},#{chairpic},#{chairnumber},#{chairtime},#{chairdetail},#{chairfrom},8)")
    Integer addChairs(ChairList chairList);

    @Select("select * from chairlist where chairname = #{chairname} and parentid = #{parentid}")
    ChairList queryByName(@Param("chairname")String chairname, @Param("parentid")Integer parentid);

    @Update("update chairlist set chairname=#{chairname},chairpic=#{chairpic},chairnumber=#{chairnumber}," +
            "chairtime=#{chairtime},chairdetail=#{chairdetail},chairfrom=#{chairfrom},parentid=9 where chairid=#{chairid}" )
    Integer updateChair(ChairList chairList);
}
