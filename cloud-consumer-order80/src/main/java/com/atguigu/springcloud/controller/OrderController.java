package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname OrderController
 * @Author: Zhao Minglei
 * @Date: 2020/4/15 0015 20:59
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    public static final String URL = "http://localhost:8001";

    @PostMapping(value = "/consumer/save/payment")
    public CommonResult<Payment> savePayment(Payment payment){
        return restTemplate.postForObject(URL+"/save/payment", payment, CommonResult.class);
    }

    @GetMapping(value = "/consumer/get/payment/by/{id}")
    public CommonResult<Payment> savePayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(URL+"/get/payment/by/"+id, CommonResult.class);
    }

}
