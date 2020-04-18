package com.atguigu.springcloud.service;

import com.atguigu.springcloud.service.impl.OrderHystrixFallBackServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname OrderHystrixService
 * @Author: Zhao Minglei
 * @Date: 2020/4/18 0018 17:26
 */
@Component
@FeignClient(value = "CLOUD-CONSUMER-HYSTRIX-PAYMENT",fallback = OrderHystrixFallBackServiceImpl.class)
public interface OrderHystrixService {

    @RequestMapping("/hystrix/send_ok/{id}")
    public String send_ok(@PathVariable("id") Integer id);


    @RequestMapping("/hystrix/send_timeout/{id}")
    public String send_timeout(@PathVariable("id") Integer id);

}
