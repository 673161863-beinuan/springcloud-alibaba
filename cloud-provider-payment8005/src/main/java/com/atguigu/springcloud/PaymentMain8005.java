package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname PaymentMain8005
 * @Author: Zhao Minglei
 * @Date: 2020/4/16 0016 21:15
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain8005 {


    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8005.class, args);
    }
}
