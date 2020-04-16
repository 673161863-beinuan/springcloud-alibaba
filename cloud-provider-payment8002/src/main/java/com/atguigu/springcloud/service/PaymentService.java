package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @Classname PaymentService
 * @Author: Zhao Minglei
 * @Date: 2020/4/15 0015 19:10
 */
public interface PaymentService {

    public int savePayment(Payment payment);

    public Payment getPaymentById(Long id);
}
