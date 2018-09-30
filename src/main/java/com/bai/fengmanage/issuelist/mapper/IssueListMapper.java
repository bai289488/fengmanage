package com.bai.fengmanage.issuelist.mapper;

import com.bai.fengmanage.issuelist.entity.IssueList;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/27
 */
@Mapper
public interface IssueListMapper {

    @Select("select * from issuelist")
    List<IssueList> queryList();

    @Select("select * from issuelist where iid = #{iid}")
    IssueList queryById(Integer iid);

    @Insert("insert into issuelist(iname,idetail,itime,istatue,imoney)values(#{iname},#{idetail},#{itime},#{istatue},#{imoney})")
    Integer addIssue(IssueList issueList);

    @Delete("delete from issuelist where iid = #{iid}")
    Integer deleteIssue(Integer iid);

    @Update("update issuelist set iname=#{iname},idetail=#{idetail},itime=#{itime},istatue=#{istatue},imoney=#{imoney} where iid=#{iid}")
    Integer updateIssue(IssueList issueList);
}
