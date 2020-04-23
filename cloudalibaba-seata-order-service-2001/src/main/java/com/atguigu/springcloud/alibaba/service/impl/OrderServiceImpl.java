package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.OrderDao;
import com.atguigu.springcloud.alibaba.domain.Order;
import com.atguigu.springcloud.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname OrderServiceImpl
 * @Author: Zhao Minglei
 * @Date: 2020/4/23 0023 21:07
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public void saveOrder(Order order) {

    }

    @Override
    public void updateOrder(Long orderId, Integer status) {

    }
}
