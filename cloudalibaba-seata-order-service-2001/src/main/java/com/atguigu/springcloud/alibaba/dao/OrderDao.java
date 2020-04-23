package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname OrderDao
 * @Author: Zhao Minglei
 * @Date: 2020/4/23 0023 21:04
 */
@Mapper
public interface OrderDao {

    /**
     * 增加订单
     * @param order
     */
    void insertOrder(Order order);

    /**
     * 根据订单id修改order状态
     * @param id
     * @param status
     */
    void updateOrder(@Param("orderId") Long id ,@Param("status") Integer status );
}
