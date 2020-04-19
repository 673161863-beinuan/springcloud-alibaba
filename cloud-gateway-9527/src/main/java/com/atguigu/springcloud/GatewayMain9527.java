package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname GatewayMain9527
 * @Author: Zhao Minglei
 * @Date: 2020/4/19 0019 15:22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayMain9527 {

    public static void main(String[] args) {
        SpringApplication.run(GatewayMain9527.class, args);
    }
}
