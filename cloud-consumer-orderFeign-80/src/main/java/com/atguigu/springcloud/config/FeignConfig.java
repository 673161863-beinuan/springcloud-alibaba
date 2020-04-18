package com.atguigu.springcloud.config;

import feign.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname FeignConfig
 * @Author: Zhao Minglei
 * @Date: 2020/4/18 0018 14:48
 *
 * feign配置类
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level getLoggerLever(){
        return Logger.Level.FULL;
    }
}
