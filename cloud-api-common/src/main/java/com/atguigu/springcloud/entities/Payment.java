package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Classname Payment
 * @Author: Zhao Minglei
 * @Date: 2020/4/15 0015 21:02
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment implements Serializable {

    private Long id;
    private String serial;
}
