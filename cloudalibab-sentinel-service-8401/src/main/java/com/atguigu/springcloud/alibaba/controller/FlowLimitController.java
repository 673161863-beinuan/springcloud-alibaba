package com.atguigu.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname FlowLimitController
 * @Author: Zhao Minglei
 * @Date: 2020/4/21 0021 21:24
 */
@RestController
public class FlowLimitController {


    @GetMapping("/testA")
    public String getA(){
        System.out.println("AAAA");
        return "AAAAAAAA";
    }

    @GetMapping("/testB")
    public String getB(){
        System.out.println("BBBBB");
        return "BBBBBB";
    }
}
