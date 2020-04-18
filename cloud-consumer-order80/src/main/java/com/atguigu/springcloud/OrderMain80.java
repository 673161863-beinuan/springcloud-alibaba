package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname OrderMain80
 * @Author: Zhao Minglei
 * @Date: 2020/4/15 0015 20:59
 */
@SpringBootApplication
@EnableEurekaClient
// 随机算法负载均衡
//@RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration= Myrule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
