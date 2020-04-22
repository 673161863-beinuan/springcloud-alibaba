package com.atguigu.springcloud.alibaba.myhandler;

import com.atguigu.springcloud.utils.CommonResult;

/**
 * @Classname BlockHandler
 * @Author: Zhao Minglei
 * @Date: 2020/4/22 0022 15:36
 */
public class BlockHandler {

    public static CommonResult myCustomerException(BlockHandler exception){

        return new CommonResult(400," 访问出现问题...BlockHandler  myCustomerException");
    }
}
