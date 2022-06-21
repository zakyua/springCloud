package com.atguigu.springCloud.service;


import com.atguigu.springCloud.Entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author ChenCheng
 * @create 2022-06-20 22:46
 */
public interface PaymentService {
     int create(Payment payment);
     Payment getPaymentById(@Param("id") Long id);
}
