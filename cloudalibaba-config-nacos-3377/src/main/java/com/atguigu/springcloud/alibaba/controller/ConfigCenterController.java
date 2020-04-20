package com.atguigu.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ConfigCenterController
 * @Author: Zhao Minglei
 * @Date: 2020/4/20 0020 20:50
 */
@RestController
@RefreshScope
public class ConfigCenterController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/get/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
