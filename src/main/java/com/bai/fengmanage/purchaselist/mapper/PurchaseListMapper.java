package com.bai.fengmanage.purchaselist.mapper;

import com.bai.fengmanage.purchaselist.entity.PurchaseList;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/19
 */
@Mapper
public interface PurchaseListMapper {

    @Select("select * from purchaselist")
    List<PurchaseList> queryList();

    @Insert("insert into purchaselist(pname,pdetail,pdate,pmoney) values(#{pname},#{pdetail},#{pdate},#{pmoney})")
    @SelectKey(statement="select LAST_INSERT_ID()", keyProperty="pid", before=false, resultType=int.class)
    Integer addPurchaseList(PurchaseList purchaseList);

    @Delete("delete from purchaselist where pid = #{pid}")
    Integer deletePurchaseList(Integer pid);

    @Update("update purchaselist set pname=#{pname},pdetail=#{pdetail},pdate=#{pdate},pmoney=#{pmoney} where pid=#{pid}")
    Integer updatePurchaseList(PurchaseList purchaseList);
}
