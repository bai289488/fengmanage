package com.bai.fengmanage.somelist.mapper;

import com.bai.fengmanage.somelist.entity.PlateList;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
@Mapper
public interface PlateListMapper {

    @Select("select * from platelist where parentid = #{parentid}")
    List<PlateList> queryList(Integer parentid);

    @Insert("insert into platelist(platename,platepic,platetime,contenturl,platenumber,platedetail," +
            "platefrom,parentid) values (#{platename},#{platepic},#{platetime}," +
            "#{contenturl},#{platenumber},#{platedetail},#{platefrom},10)")
    Integer addplate(PlateList plateList);

    @Select("select * from platelist where platename = #{platename} and parentid = #{parentid}")
    PlateList queryByName(@Param("platename")String platename, @Param("parentid")Integer parentid);

    @Update("update platelist set platename=#{platename},platepic=#{platepic},platenumber=#{platenumber}," +
            "platetime=#{platetime},platedetail=#{platedetail},platefrom=#{platefrom},parentid=10 where plateid=#{plateid}" )
    Integer updatePlate(PlateList plateList);
}
