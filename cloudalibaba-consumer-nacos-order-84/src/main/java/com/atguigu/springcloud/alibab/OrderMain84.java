package com.atguigu.springcloud.alibab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname OrderMain84
 * @Author: Zhao Minglei
 * @Date: 2020/4/22 0022 16:46
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain84 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain84.class, args);
    }
}
