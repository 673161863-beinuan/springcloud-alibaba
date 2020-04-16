package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname OrderZKMain80
 * @Author: Zhao Minglei
 * @Date: 2020/4/16 0016 20:11
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderZkMain80 {


    public static void main(String[] args) {
        SpringApplication.run(OrderZkMain80.class, args);
    }
}


