package com.atguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ChenCheng
 * @create 2022-06-22 13:11
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker  // 这个表示服务的降级
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
       SpringApplication.run(PaymentHystrixMain8001.class, args);
    }
}
