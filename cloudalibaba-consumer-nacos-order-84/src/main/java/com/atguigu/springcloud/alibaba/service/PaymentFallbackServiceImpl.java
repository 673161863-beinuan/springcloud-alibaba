package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.utils.CommonResult;
import org.springframework.stereotype.Component;

/**
 * @Classname PaymentFallbackServiceImpl
 * @Author: Zhao Minglei
 * @Date: 2020/4/23 0023 14:36
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentService {


    @Override
    public CommonResult getPaymentInfoOfOpenFeign(Long id) {
        return new CommonResult(444, "访问出现问题! ---getPaymentInfoOfOpenFeign",new Payment(id, "null"));
    }
}
