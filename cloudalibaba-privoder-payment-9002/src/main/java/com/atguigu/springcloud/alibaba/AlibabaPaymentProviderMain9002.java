package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname AlibabaPaymentProviderMain9001
 * @Author: Zhao Minglei
 * @Date: 2020/4/20 0020 17:55
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaPaymentProviderMain9002 {


    public static void main(String[] args) {
        SpringApplication.run(AlibabaPaymentProviderMain9002.class, args);
    }
}
