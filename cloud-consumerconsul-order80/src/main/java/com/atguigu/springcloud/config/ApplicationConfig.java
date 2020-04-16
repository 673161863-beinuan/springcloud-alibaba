package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname ApplicationConfig
 * @Author: Zhao Minglei
 * @Date: 2020/4/16 0016 21:29
 */
@Configuration
public class ApplicationConfig {

    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {

        return new RestTemplate();
    }

}
