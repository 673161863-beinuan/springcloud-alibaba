package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname PaymentServiceImpl
 * @Author: Zhao Minglei
 * @Date: 2020/4/15 0015 19:12
 */

@Service
public class PaymentServiceImpl implements PaymentService {


    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int savePayment(Payment payment) {
        return this.paymentDao.insertPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return this.paymentDao.getPaymentById(id);
    }
}
