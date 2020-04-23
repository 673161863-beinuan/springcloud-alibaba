package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.utils.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.UUID;

/**
 * @Classname PaymentController
 * @Author: Zhao Minglei
 * @Date: 2020/4/22 0022 16:13
 */

@RestController
public class PaymentController {
    public static HashMap<Long, Payment> paymentHashMap = new HashMap<>();
    @Value("${server.port}")
    public String serverPort;
    static {
        paymentHashMap.put(1L, new Payment(1L, UUID.randomUUID().toString()));
        paymentHashMap.put(2L, new Payment(2L, UUID.randomUUID().toString()));
        paymentHashMap.put(3L, new Payment(3L, UUID.randomUUID().toString()));


    }


    @GetMapping("/get/payment/{id}")
    public CommonResult getPaymentInfo(@PathVariable("id") Long id) {
        Payment payment = paymentHashMap.get(id);

        if (payment != null) {
            return new CommonResult(200, "查询成功!   " + serverPort, payment);
        } else {
            return new CommonResult(444, "没有此数据！");
        }
    }
}
