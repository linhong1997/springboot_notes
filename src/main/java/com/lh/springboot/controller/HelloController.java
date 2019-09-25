package com.lh.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: linhong   
 * @Date: 2019/9/25 20:04
 * @description
 * @return
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello Spring-Boot");
        return "Hello spring-boot-1-QuickStart！！！";
    }

}
