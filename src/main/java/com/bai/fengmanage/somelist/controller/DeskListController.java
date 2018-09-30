package com.bai.fengmanage.somelist.controller;

import com.bai.fengmanage.somelist.entity.*;
import com.bai.fengmanage.somelist.mapper.PlateListMapper;
import com.bai.fengmanage.somelist.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/14
 */
@Controller
@RequestMapping("somelist")
public class DeskListController {

    @Autowired
    private DeskListService deskListService;

    @Autowired
    private ChairListService chairListService;

    @Autowired
    private DishListService dishListService;

    @Autowired
    private PlateListService plateListService;

    @Autowired
    private SticksListService sticksListService;

    @RequestMapping("/{parentid}/getdesklist")
    @ResponseBody
    public List<DeskList> getdesklist(@PathVariable("parentid")Integer parentid){
        List<DeskList> list = deskListService.getList(parentid);
        return list;
    }

    @RequestMapping("/{parentid}/getchairlist")
    @ResponseBody
    public List<ChairList> getchairList(@PathVariable("parentid")Integer parentid){
        List<ChairList> list = chairListService.getList(parentid);
        return list;
    }

    @RequestMapping("/{parentid}/getdishlist")
    @ResponseBody
    public List<DishList> getdishlist(@PathVariable("parentid")Integer parentid){
        List<DishList> list = dishListService.getList(parentid);
        return list;
    }

    @RequestMapping("/{parentid}/getplatelist")
    @ResponseBody
    public List<PlateList> getplatelist(@PathVariable("parentid")Integer parentid){
        List<PlateList> list = plateListService.getLists(parentid);
        return list;
    }

    @RequestMapping("/{parentid}/getstickslist")
    @ResponseBody
    public List<SticksList> getstickslist(@PathVariable("parentid")Integer parentid){
        List<SticksList> list = sticksListService.getLists(parentid);
        return list;
    }
}
