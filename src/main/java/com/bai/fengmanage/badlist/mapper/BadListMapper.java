package com.bai.fengmanage.badlist.mapper;

import com.bai.fengmanage.badlist.entity.BadList;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/17
 */
@Mapper
public interface BadListMapper {

    @Select("select * from badlist where btype = #{btype}")
    List<BadList> queryList(Integer btype);

    @Select("select * from badlist where bid = #{bid}")
    BadList queryById(Integer bid);

    @Insert("insert into badlist(bname,btime,bnumber,bdetail,btype)values(#{bname},#{btime},#{bnumber},#{bdetail},#{btype})")
    Integer addList(BadList badList);

    @Update("update badlist set bname=#{bname},btime=#{btime},bnumber=#{bnumber},bdetail=#{bdetail},btype=#{btype} where bid=#{bid}")
    Integer updateList(BadList badList);

    @Delete("delete from badlist where bid = #{bid}")
    Integer removeList(Integer bid);
}
