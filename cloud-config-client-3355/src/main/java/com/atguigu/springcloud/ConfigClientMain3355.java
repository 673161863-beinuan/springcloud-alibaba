package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname ConfigClientMain3355
 * @Author: Zhao Minglei
 * @Date: 2020/4/19 0019 20:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientMain3355 {


    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3355.class, args);
    }
}
