package com.atguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ChenCheng
 * @create 2022-06-22 20:13
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
       SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}
