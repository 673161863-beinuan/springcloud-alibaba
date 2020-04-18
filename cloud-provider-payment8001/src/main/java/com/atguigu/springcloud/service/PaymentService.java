package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @Classname PaymentService
 * @Author: Zhao Minglei
 * @Date: 2020/4/15 0015 19:10
 */
public interface PaymentService {

    /**
     * 保存payment信息
     * @param payment
     * @return
     */
    public int savePayment(Payment payment);

    /**
     * 根据id获取一个payment信息
     * @param id
     * @return
     */
    public Payment getPaymentById(Long id);
}
