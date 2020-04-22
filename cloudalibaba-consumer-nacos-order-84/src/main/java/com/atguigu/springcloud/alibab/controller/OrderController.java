package com.atguigu.springcloud.alibab.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname OrderController
 * @Author: Zhao Minglei
 * @Date: 2020/4/22 0022 16:47
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    public static final String URL = "httP://cloud-alibaba-nacos-provider-payment";


    @SentinelResource(value = "payment",fallback = "fallbackHandler")
    @GetMapping("/consumer/get/payment/{id}")
    public CommonResult getPaymentInfo(@PathVariable("id") Long id){

        CommonResult result = restTemplate.getForObject(URL + "/get/payment/" + id, CommonResult.class);
        if(id == 4){
            throw new IllegalArgumentException("参数异常");
        }else if(id > 4){
            throw new IllegalArgumentException("没有此ID");
        }
        return result;

    }

    //fallback
    public CommonResult fallbackHandler(@PathVariable("id") Long id,Throwable e){

        Payment payment = new Payment(id, null);
        return new CommonResult(444, "兜底方法..." + payment,e.getMessage());
    }
}
