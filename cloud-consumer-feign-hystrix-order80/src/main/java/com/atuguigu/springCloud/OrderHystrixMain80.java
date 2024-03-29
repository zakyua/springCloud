package com.atuguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ChenCheng
 * @create 2022-06-22 13:23
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
//@EnableHystrix
public class OrderHystrixMain80 {
    public static void main(String[] args) {
       SpringApplication.run(OrderHystrixMain80.class, args);
    }
}
