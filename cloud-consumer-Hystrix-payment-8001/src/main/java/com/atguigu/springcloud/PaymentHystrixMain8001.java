package com.atguigu.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * @Classname OrderHystrixMain80
 * @Author: Zhao Minglei
 * @Date: 2020/4/18 0018 16:04
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class PaymentHystrixMain8001 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentHystrixMain8001.class, args);
    }

    /**
     * 新版本必须配置这个bean，否则会报出找不到监控服务的错误
     * @return
     */
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
