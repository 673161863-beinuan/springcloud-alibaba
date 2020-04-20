package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname StreamRabbitmqConsumerMain8803
 * @Author: Zhao Minglei
 * @Date: 2020/4/20 0020 13:22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StreamRabbitmqConsumerMain8803 {

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitmqConsumerMain8803.class, args);
    }
}
