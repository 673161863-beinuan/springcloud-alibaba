package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Classname OrderFeignMain80
 * @Author: Zhao Minglei
 * @Date: 2020/4/18 0018 13:26
 */

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class OrderFeignMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}
