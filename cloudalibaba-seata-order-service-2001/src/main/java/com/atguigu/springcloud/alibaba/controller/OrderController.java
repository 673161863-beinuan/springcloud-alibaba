package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname OrderController
 * @Author: Zhao Minglei
 * @Date: 2020/4/23 0023 21:06
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
}
