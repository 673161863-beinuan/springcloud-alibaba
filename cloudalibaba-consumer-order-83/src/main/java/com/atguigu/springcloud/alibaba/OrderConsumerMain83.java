package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname OrderConsumerMain83
 * @Author: Zhao Minglei
 * @Date: 2020/4/20 0020 19:44
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsumerMain83 {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerMain83.class, args);
    }
}
