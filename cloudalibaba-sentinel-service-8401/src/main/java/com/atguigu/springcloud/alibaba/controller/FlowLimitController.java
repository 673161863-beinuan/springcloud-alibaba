package com.atguigu.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.atguigu.springcloud.alibaba.myhandler.BlockHandler;
import com.atguigu.springcloud.utils.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname FlowLimitController
 * @Author: Zhao Minglei
 * @Date: 2020/4/21 0021 21:24
 */
@RestController
public class FlowLimitController {


    @GetMapping("/testA")
    public String getA(){
        System.out.println("AAAA");
        return "AAAAAAAA";
    }

    @GetMapping("/testB")
    public String getB(){
        System.out.println("BBBBB");
        return "BBBBBB";
    }

    @GetMapping("/customer/resource")
    @SentinelResource(value = "resource",blockHandlerClass = BlockHandler.class,blockHandler = "myCustomerException")
    public CommonResult customer(){

        return new CommonResult(200, "访问正常","data");
    }
}
