package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.FeignService;
import com.atguigu.springcloud.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Classname OrderFeignController
 * @Author: Zhao Minglei
 * @Date: 2020/4/18 0018 13:30
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/consumer/get/payment/by/{id}")
    public CommonResult<Payment> getPaymentInfoById(@PathVariable("id") Long id) {
        CommonResult paymentById = feignService.getPaymentById(id);

        log.info("*********" + paymentById.getData().toString());
        return paymentById;
    }



    // 测试超时
    @RequestMapping("/consumer/payment/timeout")
    public CommonResult<Integer> testTimeout(){
        return  feignService.testTimeout();
    }
}
