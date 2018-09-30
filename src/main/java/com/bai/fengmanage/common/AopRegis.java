package com.bai.fengmanage.common;

import java.lang.annotation.*;

/**
 * @author admin
 * @version 2018/9/19
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.PARAMETER})
@Documented
public @interface AopRegis {

    String description() default "";
}
