package com.bai.fengmanage.user.controller;

import com.bai.fengmanage.user.entity.User;
import com.bai.fengmanage.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author admin
 * @version 2018/9/12
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String tologView(){
        return "index";
    }

    @RequestMapping("todo")
    public String toindex(String name,String password,Model model,HttpSession session){
        User names = userService.getByName(name);
        session.setAttribute("usersname",name);
        if(password.equals(names.getPassword())){
            model.addAttribute("username",name);
            return "main";
        }else{
            return "index";
        }
    }

    @RequestMapping("logOut")
    public String logout(){
        return "redirect:/login";
    }

    @RequestMapping("regis")
    @ResponseBody
    public String toRegis(String name,String password,Model model){
        User u = new User();
        u.setName(name);
        u.setPassword(password);
        Integer result = userService.insertUser(u);
        return result+"";
    }

    @RequestMapping("getlists")
    @ResponseBody
    public List<User> queryList(){
        List<User> list = userService.getList();
        return list;
    }
}
