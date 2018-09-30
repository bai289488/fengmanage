package com.bai.fengmanage.ueditor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author admin
 * @version 2018/9/30
 */
@Controller
public class UEditorController {

    @RequestMapping("ueditor")
    public String ueditor(){
        return "ueditor";
    }
}
