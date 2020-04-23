package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.utils.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Classname PaymentService
 * @Author: Zhao Minglei
 * @Date: 2020/4/23 0023 14:25
 */
@FeignClient(value = "cloud-alibaba-nacos-provider-payment",fallback = PaymentFallbackServiceImpl.class)
public interface PaymentService {

    @GetMapping("/get/payment/{id}")
    public CommonResult getPaymentInfoOfOpenFeign(@PathVariable("id") Long id);
}
