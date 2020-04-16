package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Classname EurekaMain7001
 * @Author: Zhao Minglei
 * @Date: 2020/4/16 0016 14:58
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7001 {


    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
