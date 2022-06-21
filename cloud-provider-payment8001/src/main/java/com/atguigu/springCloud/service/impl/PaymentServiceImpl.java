package com.atguigu.springCloud.service.impl;

import com.atguigu.springCloud.Entities.Payment;
import com.atguigu.springCloud.dao.PaymentDao;
import com.atguigu.springCloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ChenCheng
 * @create 2022-06-20 22:47
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
       return   paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
       return paymentDao.getPaymentById(id);
    }
}
