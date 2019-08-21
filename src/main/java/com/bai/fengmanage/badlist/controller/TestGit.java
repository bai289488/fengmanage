package com.bai.fengmanage.badlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestGit {

    @GetMapping("togit")
    public String toGit(){

        return "hello";
    }
}
