package com.atguigu.springcloud.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname CommonResult
 * @Author: Zhao Minglei
 * @Date: 2020/4/15 0015 21:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {


    /**
     * 返回状态码
     */
    private Integer code;
    /**
     * 返回异常消息
     */
    private String message;
    /**
     * 返回数据
     */
    private T      data;

    /**
     * 没有数据返回值时调用该方法
     * @param code
     * @param message
     */
    public CommonResult(Integer code, String message){

        this.code = code;
        this.message = message;
        this.data = null;
    }
}
