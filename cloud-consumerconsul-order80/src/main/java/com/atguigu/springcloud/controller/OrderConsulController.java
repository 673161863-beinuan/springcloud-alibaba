package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname OrderConsulConytrooler
 * @Author: Zhao Minglei
 * @Date: 2020/4/16 0016 21:30
 */
@RestController
public class OrderConsulController {

    public static final String URL = "http://consul-provider-payment";

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/consumer/payment/consul")
    public String getPaymentInfo(){
        return restTemplate.getForObject(URL+"/payment/consul",String.class);
    }

}
