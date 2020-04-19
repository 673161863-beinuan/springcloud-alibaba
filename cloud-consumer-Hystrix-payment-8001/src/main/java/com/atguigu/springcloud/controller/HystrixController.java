package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.HystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HystrixMain80
 * @Author: Zhao Minglei
 * @Date: 2020/4/18 0018 16:11
 */
@RestController
@Slf4j
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;


    @RequestMapping("/hystrix/send_ok/{id}")
    public String send_ok(@PathVariable("id") Integer id){
        log.info("******ok_id = "+id);
        return hystrixService.send_ok(id);
    }

    @RequestMapping("/hystrix/send_timeout/{id}")
    public String send_timeout(@PathVariable("id") Integer id){
            log.info("******timeout_id = "+id);
        return hystrixService.send_timeout(id);
    }

    @RequestMapping("/hystrix/circuit/breaker/{id}")
    public String testHystrixCircuitBreaker(@PathVariable("id") Integer id){

        return hystrixService.testHystrixCircuitBreaker(id);
    }
}
