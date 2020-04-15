package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.utils.CommonResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname PaymentDao
 * @Author: Zhao Minglei
 * @Date: 2020/4/15 0015 18:08
 */
@Mapper
public interface PaymentDao {

    /**
     * 添加Payment
     * @param payment
     * @return
     *      返回int类型
     *      1 -- 成功
     *      0 -- 失败
     */
    public int insertPayment(Payment payment);

    /**
     * 根据id查询Payment
     * @param id  Payment的主键id
     * @return
     *   返回Payment实体
     */
    public Payment getPaymentById(@Param("id") Long id);
}
