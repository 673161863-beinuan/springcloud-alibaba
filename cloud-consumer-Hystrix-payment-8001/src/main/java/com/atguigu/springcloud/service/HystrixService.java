package com.atguigu.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Classname HystrixService
 * @Author: Zhao Minglei
 * @Date: 2020/4/18 0018 16:05
 */
@Service
public class HystrixService {

    public String send_ok(Integer id) {

        return "send_ok" + Thread.currentThread().getName() + "\t" + id;
    }


    @HystrixCommand(fallbackMethod = "send_timeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String send_timeout(Integer id) {
        Integer time = 2000;
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.getStackTrace();
        }
        return "send_timeout" + Thread.currentThread().getName() + "\t" + id + "\t" + "耗时：" + time + "毫秒";
    }


    public String send_timeoutHandler(Integer id) {

        return "send_timeout" + Thread.currentThread().getName() + "\t" + id + " 请求超时请重试"+"\t"  + "send_timeoutHandler";
    }


    @HystrixCommand(fallbackMethod = "hystrixCircuitBreakerFallBack",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value ="true" ), // 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),  // 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 时间
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60") // 错误率
    })
    public String testHystrixCircuitBreaker(Integer id){

        if (id <0){

            throw  new RuntimeException("不能为负数!");
        }

        String simpleUUID = IdUtil.simpleUUID();

        return "testHystrixCircuitBreaker    " + simpleUUID;
    }

    public String hystrixCircuitBreakerFallBack( Integer id){

        return "不能为负数!";
    }
}

