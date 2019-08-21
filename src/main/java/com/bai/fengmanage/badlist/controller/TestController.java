package com.bai.fengmanage.badlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/hellofirst")
    @ResponseBody
    public String getList(){
        return "hello man";
    }
}
