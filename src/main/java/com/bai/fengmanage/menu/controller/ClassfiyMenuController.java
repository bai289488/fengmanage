package com.bai.fengmanage.menu.controller;

import com.bai.fengmanage.menu.entity.ClassfiyMenu;
import com.bai.fengmanage.menu.service.ClassfiyMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/13
 */
@Controller
@RequestMapping("classfiy")
public class ClassfiyMenuController {

    @Autowired
    private ClassfiyMenuService classfiyMenuService;

    @RequestMapping(value = "/{paremtsId}/getClassList")
    @ResponseBody
    public List<ClassfiyMenu> getClassList(@PathVariable("paremtsId")Integer paremtsId){
        List<ClassfiyMenu> list = classfiyMenuService.getList(paremtsId);
        return  list;
    }
}
