package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname StreamRabbitmqProviderMain8802
 * @Author: Zhao Minglei
 * @Date: 2020/4/20 0020 12:59
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StreamRabbitmqProviderMain8802 {

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitmqProviderMain8802.class, args);
    }
}
