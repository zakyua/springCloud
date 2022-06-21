package com.atguigu.springCloud.dao;


import com.atguigu.springCloud.Entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ChenCheng
 * @create 2022-06-20 22:34
 */
@Mapper
public interface PaymentDao
{
    /**
     *  插入一条数据
     * @param payment
     * @return
     */
     int create(Payment payment);


    /**
     *  根据id查询一个数据
     * @param id
     * @return
     */
     Payment getPaymentById(@Param("id") Long id);
}

