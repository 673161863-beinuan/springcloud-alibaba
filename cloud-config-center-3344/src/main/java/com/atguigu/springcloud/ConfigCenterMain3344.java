package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Classname ConfigCenterMain3344
 * @Author: Zhao Minglei
 * @Date: 2020/4/19 0019 17:59
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {


    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}
