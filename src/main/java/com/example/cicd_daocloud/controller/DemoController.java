package com.example.cicd_daocloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author ZH
 * @Date 2020/9/29 0029
 * @Version 1.0
 * @Description
 **/
@RestController
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(HttpServletRequest request){
        return "Hello World!";
    }
}
