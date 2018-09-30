package com.bai.fengmanage.badlist.controller;

import com.bai.fengmanage.badlist.entity.BadList;
import com.bai.fengmanage.badlist.service.BadListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author admin
 * @version 2018/9/17
 */
@Controller
@RequestMapping("badlist")
public class BadListController {

    @Autowired
    private BadListService badListService;

    @RequestMapping("/{btype}/getbadlist")
    @ResponseBody
    public List<BadList> getbadlist(@PathVariable("btype")Integer btype){
        List<BadList> list = badListService.getList(btype);
        return list;
    }

    @RequestMapping("/{bid}/getbad")
    @ResponseBody
    public BadList getbad(@PathVariable("bid")Integer bid){
        BadList lists = badListService.getById(bid);
        return lists;
    }

    @RequestMapping("addbadlist")
    @ResponseBody
    public String addbadlist(String bname,String btime,Integer bnumber,String bdetail,Integer btype)throws Exception{
        BadList b = new BadList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date pp = sdf.parse(btime);
        b.setBname(bname);
        b.setBtime(pp);
        b.setBnumber(bnumber);
        b.setBdetail(bdetail);
        b.setBtype(btype);
        Integer list = badListService.insertList(b);
        if(list==1){
            return "success";
        }else{
            return "false";
        }
    }
    @RequestMapping("updatebadlist")
    @ResponseBody
    public String updatebadlist(Integer bid,String bname,String btime,Integer bnumber,String bdetail,Integer btype) throws Exception{
        BadList b = new BadList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date pp = sdf.parse(btime);
        b.setBid(bid);
        b.setBname(bname);
        b.setBtime(pp);
        b.setBnumber(bnumber);
        b.setBdetail(bdetail);
        b.setBtype(btype);
        Integer list = badListService.updateList(b);
        if(list==1){
            return "success";
        }else{
            return "false";
        }
    }

    @RequestMapping("/{its}/removebad")
    @ResponseBody
    public String addbadlist(@PathVariable("its") String its){
        String[] split = its.split(",");
        Integer list = badListService.deleteList(split);
        if(list!=null){
            return "success";
        }else{
            return "false";
        }
    }
}
