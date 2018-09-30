package com.bai.fengmanage.issuelist.controller;

import com.bai.fengmanage.issuelist.entity.IssueList;
import com.bai.fengmanage.issuelist.entity.OutList;
import com.bai.fengmanage.issuelist.service.IssueListService;
import com.bai.fengmanage.issuelist.service.OutListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author admin
 * @version 2018/9/27
 */
@Controller
@RequestMapping("issuelist")
public class IssueListController {

    @Autowired
    private IssueListService issueListService;

    @Autowired
    private OutListService outListService;

    @RequestMapping("getLists")
    @ResponseBody
    public List<IssueList> getLists(){
        List<IssueList> list = issueListService.getList();
        return list;
    }

    @RequestMapping("insertList")
    @ResponseBody
    public String insertList(String iname,String idetail,String itime,Double imoney) throws ParseException {
        IssueList is = new IssueList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        is.setIname(iname);
        is.setIdetail(idetail);
        is.setIstatue(1);
        is.setImoney(imoney);
        Date parse = sdf.parse(itime);
        is.setItime(parse);
        Integer issue = issueListService.insertIssue(is);
        if(issue==1){
            return "success";
        }else{
            return "false";
        }
    }

    @RequestMapping("/{iid}/deleteList")
    @ResponseBody
    public String deleteList(@PathVariable("iid")Integer iid){
        Integer issue = issueListService.deleteIssue(iid);
        if(issue==1){
            return "success";
        }else{
            return "false";
        }
    }

    @RequestMapping("/{parentid}/getoutlist")
    @ResponseBody
    public List<OutList> getOutList(@PathVariable("parentid")Integer parentid){
        List<OutList> list = outListService.getTingList(parentid);
        return list;
    }
}
