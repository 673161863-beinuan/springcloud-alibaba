package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname NacosConfigCenterMain3377
 * @Author: Zhao Minglei
 * @Date: 2020/4/20 0020 20:50
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigCenterMain3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigCenterMain3377.class, args);
    }
}
