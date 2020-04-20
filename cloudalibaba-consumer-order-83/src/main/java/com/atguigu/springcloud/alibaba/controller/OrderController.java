package com.atguigu.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname OrderController
 * @Author: Zhao Minglei
 * @Date: 2020/4/20 0020 19:46
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;


    @Value("${service-url.nacos-user-service}")
    private String userURL;

    @GetMapping("/consumer/get/payment/by/{id}")
    public String getPayment(@PathVariable("id") Integer id) {

        return restTemplate.getForObject(userURL + "/get/payment/by/" + id, String.class);
    }
}
