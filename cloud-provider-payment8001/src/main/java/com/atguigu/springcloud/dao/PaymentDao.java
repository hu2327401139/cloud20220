package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author hy 2327401139@qq.com
 * @version 1.0 2022/11/8 21:53
 */
@Mapper
public interface PaymentDao {

    /**
     * 创建
     */
    int create(Payment payment);

    /**
     * 通过ID查询
     */
    Payment getPaymentById(@Param("id") Long id);


}
