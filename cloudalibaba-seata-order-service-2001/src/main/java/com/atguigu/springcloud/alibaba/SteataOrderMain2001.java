package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Classname SteataOrderMain2001
 * @Author: Zhao Minglei
 * @Date: 2020/4/23 0023 20:55
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SteataOrderMain2001 {

    public static void main(String[] args) {
        SpringApplication.run(SteataOrderMain2001.class, args);
    }
}
