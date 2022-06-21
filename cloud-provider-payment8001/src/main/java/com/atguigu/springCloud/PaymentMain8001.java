package com.atguigu.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 微服务是一种架构风格
 * 一个应用拆分为一组小型服务
 * 每个服务运行在自己的进程内，也就是可独立部署和升级
 * 服务之间使用轻量级HTTP交互
 * 服务围绕业务功能拆分
 * 可以由全自动部署机制独立部署
 * 去中心化，服务自治。服务可以使用不同的语言、不同的存储技术
 *
 *服务调用
 * 服务降级
 * 服务注册与发先
 * 服务熔断
 * 负载均衡
 * 服务消息队列
 * 服务网关
 * 配置中心管理
 * 自动化构建部署
 * 服务监控
 * 全链路追踪
 * 服务定时任务
 * 调度操作
 *
 * @author ChenCheng
 * @create 2022-06-20 22:28
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
