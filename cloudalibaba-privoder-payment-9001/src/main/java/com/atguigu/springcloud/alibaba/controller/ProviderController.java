package com.atguigu.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ProviderController
 * @Author: Zhao Minglei
 * @Date: 2020/4/20 0020 17:59
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/get/payment/by/{id}")
    public String getPaymentById(@PathVariable("id") Integer id){

        return "ProviderController  =====>" + id + "\t" + serverPort;
    }
}
