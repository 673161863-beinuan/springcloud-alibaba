package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Classname Myrule
 * @Author: Zhao Minglei
 * @Date: 2020/4/17 0017 14:34
 */
@Component
public class Myrule  {

    @Bean
    public RandomRule getRandomRule(){
        return new RandomRule();
    }
}
