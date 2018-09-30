package com.bai.fengmanage.menu.mapper;

import com.bai.fengmanage.menu.entity.ClassfiyMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/13
 */
@Mapper
public interface ClassfiyMenuMapper {

    @Select("select * from classfiy_menu where parentsid = #{parentId}")
     List<ClassfiyMenu> queryList(Integer parentId);
}
