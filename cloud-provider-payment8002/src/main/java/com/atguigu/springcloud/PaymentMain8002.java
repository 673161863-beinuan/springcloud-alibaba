package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * PaymentMain8001：
 *
 * @author: Zhao Minglei
 * @date: 2020/4/15 0015 16:35
 */
@SpringBootApplication
// 开启Eureka客户端
@EnableEurekaClient
public class PaymentMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }
}
