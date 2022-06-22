package com.atguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ChenCheng
 * @create 2022-06-22 12:39
 */
@SpringBootApplication
@EnableFeignClients         // 这个微服务是一个消费者，他需要远程访问别的微服务
public class OrderFeignMain80 {
    public static void main(String[] args) {
       SpringApplication.run(OrderFeignMain80.class, args);
    }
}
