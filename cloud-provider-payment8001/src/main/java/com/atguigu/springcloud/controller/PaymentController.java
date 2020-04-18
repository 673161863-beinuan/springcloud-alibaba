package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import com.atguigu.springcloud.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeoutException;

/**
 * @Classname PaymentController
 * @Author: Zhao Minglei
 * @Date: 2020/4/15 0015 19:16
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/save/payment")
    public CommonResult savePayment(@RequestBody Payment payment) {

        int result = paymentService.savePayment(payment);
        // 打印日志
        log.info(result + "");
        // 判断返回结果
        if (result > 0) {
            // 大于0插入成功
            return new CommonResult(200, "数据插入成功! serverPort = " + serverPort, result);
        } else {
            // 小于0插入失败
            return new CommonResult(444, "数据插入失败!", null);
        }
    }

    @GetMapping(value = "/get/payment/by/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {

        Payment payment = paymentService.getPaymentById(id);
        // 打印日志
        log.info(payment.toString());
        // 判断payment是否为空
        if (payment != null) {
            // 不为空，查询到数据
            return new CommonResult(200, "查询" + id + "号记录成功 serverPort = " + serverPort, payment);
        } else {
            // 为空，没有此条数据
            return new CommonResult(444, "没有" + id + "号记录", null);
        }
    }

    @RequestMapping(value = "/payment/discovery")
    public Object getDiscovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("****" + service);
        }
        String serverName = "CLOUD-PAYMENT-SERVICE";
        List<ServiceInstance> instances = discoveryClient.getInstances(serverName);
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() +
                    "\t" + instance.getHost() + "\t" + instance.getUri());
        }

        return this.discoveryClient;

    }

    // 测试超时
    @RequestMapping("/payment/timeout")
    public CommonResult<Integer> testTimeout(){

        try {

            Thread.sleep(3000);
        }catch (Exception e){

        }
        return new CommonResult(200, "未超时!",serverPort) ;
    }
}
