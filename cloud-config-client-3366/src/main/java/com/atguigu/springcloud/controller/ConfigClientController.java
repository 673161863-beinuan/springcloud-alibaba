package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ConfigClientController
 * @Author: Zhao Minglei
 * @Date: 2020/4/19 0019 21:03
 */
@RestController
@RefreshScope
public class ConfigClientController {


    @Value("${config.info}")
    private String configInfo;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/get/config/info")
    public String getConfigInfo() {
        return "configInfo  => " + configInfo + "\t" + "serverPort =>" + serverPort;
    }
}
