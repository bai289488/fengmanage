package com.bai.fengmanage.purchaselist.mapper;

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
public interface TingListMapper {

    @Select("select * from tinglist where parentid=#{parentid}")
    List<TingList> queryTingList(Integer parentid);

    @Insert("insert into tinglist(tname,tone,tnumber,tall,parentid) values(#{tname},#{tone},#{tnumber},#{tall},#{parentid})")
    Integer addTingList(TingList tingLists);

    @Delete("delete from tinglist where parentid=#{parentid}")
    Integer deleteTingList(Integer parentid);
}
