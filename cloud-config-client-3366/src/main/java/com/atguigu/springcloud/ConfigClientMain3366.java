package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname ConfigClientMain3366
 * @Author: Zhao Minglei
 * @Date: 2020/4/19 0019 21:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientMain3366 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3366.class, args);
    }
}
