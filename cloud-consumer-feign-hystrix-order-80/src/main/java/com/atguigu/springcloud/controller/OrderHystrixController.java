package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.OrderHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname OrderHystrixController
 * @Author: Zhao Minglei
 * @Date: 2020/4/18 0018 17:28
 */
@RestController
@Slf4j
//@DefaultProperties(defaultFallback = "golbalFallbackMethod")
public class OrderHystrixController {

    @Autowired
    private OrderHystrixService orderHystrixService;


    @RequestMapping("/consumer/hystrix/send_ok/{id}")
    public String send_ok(@PathVariable("id") Integer id){
        log.info("******ok_id = "+id);
        return orderHystrixService.send_ok(id);
    }

    /*@HystrixCommand(fallbackMethod = "send_timeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })*/
    //@HystrixCommand
    @RequestMapping("/consumer/hystrix/send_timeout/{id}")
    public String send_timeout(@PathVariable("id") Integer id){
        // int age = 10/0;
        log.info("******timeout_id = "+id);
        return orderHystrixService.send_timeout(id);
    }

    public String send_timeoutHandler(Integer id) {

        return "我是消费者80" + Thread.currentThread().getName() + "\t" + id + " 请求超时请重试"+"\t"  + "send_timeoutHandler";
    }

    public String golbalFallbackMethod(){

        return "GolbalFallbackMethod 请重试!";
    }
}
