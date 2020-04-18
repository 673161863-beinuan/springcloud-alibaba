package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

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
}

