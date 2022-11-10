package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author hy 2327401139@qq.com
 * @version 1.0 2022/11/8 22:18
 */
public interface PaymentService {

    /**
     * 创建
     */
    int create(Payment payment);

    /**
     * 通过ID查询
     */
    Payment getPaymentById(Long id);

}
