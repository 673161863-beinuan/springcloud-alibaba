package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.utils.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname FeignService
 * @Author: Zhao Minglei
 * @Date: 2020/4/18 0018 13:27
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface FeignService {


    /**
     * 根据id 获取payment信息远程接口
     * @param id
     * @return
     */
    @GetMapping(value = "/get/payment/by/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @RequestMapping("/payment/timeout")
    public CommonResult<Integer> testTimeout();
}
