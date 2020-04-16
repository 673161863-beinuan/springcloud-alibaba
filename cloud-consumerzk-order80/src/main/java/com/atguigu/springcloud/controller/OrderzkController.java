package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sun.security.provider.PolicySpiFile;

/**
 * @Classname OrderzkController
 * @Author: Zhao Minglei
 * @Date: 2020/4/16 0016 20:14
 */
@RestController
public class OrderzkController {

    //写cloud-provider-payment-service服务名需要在注入RestTemplate的配置bean上加@LoadBalanced
    // 否则会报找不到这个服务名的异常
    public static final String INVOKE_URL = "http://cloud-provider-payment-service";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/zk")
    public String getPaymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        return result ;
    }
}
