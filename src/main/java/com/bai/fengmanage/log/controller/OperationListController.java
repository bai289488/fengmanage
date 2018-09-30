package com.bai.fengmanage.log.controller;

import com.bai.fengmanage.log.entity.Log;
import com.bai.fengmanage.log.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/19
 */
@Controller
@RequestMapping("operationlist")
public class OperationListController {

    @Autowired
    private LogService logService;

    @RequestMapping("getlist")
    @ResponseBody
    public List<Log> getList(){
        List<Log> logs = logService.getList();
        return logs;
    }
}
