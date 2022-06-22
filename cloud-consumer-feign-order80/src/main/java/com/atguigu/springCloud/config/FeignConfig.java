package com.atguigu.springCloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign 的日志增强功能
 * @author ChenCheng
 * @create 2022-06-22 13:01
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }

}
