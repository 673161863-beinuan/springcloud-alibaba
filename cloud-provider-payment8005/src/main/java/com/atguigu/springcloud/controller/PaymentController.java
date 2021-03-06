package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Classname PaymentController
 * @Author: Zhao Minglei
 * @Date: 2020/4/16 0016 21:16
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String getZookeeperInfo() {

        return "This is SpringCloud With consul   " + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
