package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname GatewayConfig
 * @Author: Zhao Minglei
 * @Date: 2020/4/19 0019 16:05
 */
@Configuration
public class GatewayConfig {


    @Bean
    public RouteLocator custmerRoutelocator(RouteLocatorBuilder builder){

        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("gateway", r->r.path("/guoji").uri("http://news.baidu.com/guoji")).build();

        return routes.build();
    }
}
