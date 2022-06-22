package com.atguigu.springCloud.service;

import com.atguigu.springCloud.Entities.CommonResult;
import com.atguigu.springCloud.Entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *  OpenFeign的@Feignclient可以解析SpringMVc的@RequestMapping注解下的接口，
 *  并通过动态代理的方式产生实现类，实现类中做负载均衡并调用其他服务
 * @author ChenCheng
 * @create 2022-06-22 12:43
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")  // 自带负载均衡
@Component
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

}
