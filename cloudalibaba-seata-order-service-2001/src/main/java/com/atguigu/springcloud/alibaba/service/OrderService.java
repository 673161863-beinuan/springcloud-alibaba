package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.dao.OrderDao;
import com.atguigu.springcloud.alibaba.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname OrderService
 * @Author: Zhao Minglei
 * @Date: 2020/4/23 0023 21:05
 */

public interface OrderService {

    void saveOrder(Order order);

    void updateOrder(Long orderId, Integer status);

}
