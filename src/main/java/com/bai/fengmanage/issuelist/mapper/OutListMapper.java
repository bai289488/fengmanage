package com.bai.fengmanage.issuelist.mapper;

import com.bai.fengmanage.issuelist.entity.OutList;
import com.bai.fengmanage.purchaselist.entity.TingList;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/19
 */
@Mapper
public interface OutListMapper {

    @Select("select * from outlist where parentid=#{parentid}")
    List<OutList> queryTingList(Integer parentid);

    @Insert("insert into outlist(tname,tone,tnumber,tall,parentid) values(#{tname},#{tone},#{tnumber},#{tall},#{parentid})")
    Integer addTingList(OutList tingLists);

    @Delete("delete from outlist where parentid=#{parentid}")
    Integer deleteTingList(Integer parentid);
}
