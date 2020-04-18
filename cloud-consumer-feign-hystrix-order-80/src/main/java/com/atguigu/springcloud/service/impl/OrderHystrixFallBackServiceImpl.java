package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.OrderHystrixService;
import org.springframework.stereotype.Component;

/**
 * @Classname OrderHystrixFallBackServiceImpl
 * @Author: Zhao Minglei
 * @Date: 2020/4/18 0018 20:15
 */
@Component
public class OrderHystrixFallBackServiceImpl implements OrderHystrixService {

    @Override
    public String send_ok(Integer id) {
        return "OrderHystrixFallBackServiceImpl 系统出现问题，请稍后再试 send_ok";
    }

    @Override
    public String send_timeout(Integer id) {
        return "OrderHystrixFallBackServiceImpl 系统出现问题，请稍后再试 send_timeout";
    }
}
