package com.bai.fengmanage.log.mapper;

import com.bai.fengmanage.log.entity.Log;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/19
 */
@Mapper
public interface LogMapper {

    @Select("select * from log")
    List<Log> queryList();

    @Insert("insert into log(lname,ldate,method) values(#{lname},#{ldate},#{method})")
    @SelectKey(statement="select LAST_INSERT_ID()", keyProperty="lid", before=false, resultType=int.class)
    Integer addList(Log log);

    @Update("update log set results = #{results} where lid = #{lid}")
    Integer updateList(@Param("results") String results,@Param("lid") Integer lid);
}
