package com.atguigu.springCloud.controller;

import com.atguigu.springCloud.Entities.CommonResult;
import com.atguigu.springCloud.Entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ChenCheng
 * @create 2022-06-20 23:14
 */
@RestController
@Slf4j
public class OrderController {
    // 单击环境下的地址
     //public static final String PAYMENT_URL = "http://localhost:8001";

    /**
     * 搭建了支付功能的集群,只需要对外暴露在注册中心的地址
     * 需要开启RestTemplate的负载均衡,@LoadBalanced
     */
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id, CommonResult.class);
    }


}
