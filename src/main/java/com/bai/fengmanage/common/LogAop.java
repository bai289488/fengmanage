package com.bai.fengmanage.common;

import com.bai.fengmanage.log.entity.Log;
import com.bai.fengmanage.log.service.LogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author admin
 * @version 2018/9/19
 */

@Aspect
@Component
public class LogAop {

    @Autowired
    private LogService logService;

    @Around("@annotation(com.bai.fengmanage.common.AopRegis)")
    public void around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("切面开始====+++++++++++++++++++++++++++++++");
        Log log = new Log();
        String result = null;
        pjp.proceed();
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession se = request.getSession();
        String usersname = (String)se.getAttribute("usersname");
        //在什么时间
        Date createTime = new Date();

        MethodSignature ms = (MethodSignature) pjp.getSignature();
        Method method = ms.getMethod();
        String methodName = method.getName();
        if(methodName.contains("update")){
            methodName="修改";
        }else if(methodName.contains("insert")){
            methodName="添加";
        }else if(methodName.contains("delete")){
            methodName="删除";
        }
        log.setLname(usersname);
        log.setLdate(createTime);
        log.setMethod(methodName);
        Integer results = logService.insertList(log);
        Integer lid = log.getLid();
        String re = "";
        if(results==1){
            re = "success";
        }else{
            re = "fail";
        }
        Integer list = logService.updateList(re, lid);
        System.out.println("切面结束+=====================");
    }
}
