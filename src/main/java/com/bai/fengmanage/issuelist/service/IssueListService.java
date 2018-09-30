package com.bai.fengmanage.issuelist.service;

import com.bai.fengmanage.issuelist.entity.IssueList;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/27
 */
public interface IssueListService {

    List<IssueList> getList();

    IssueList getById(Integer iid);

    Integer insertIssue(IssueList issueList);

    Integer deleteIssue(Integer iid);

    Integer updateIssue(IssueList issueList);
}
