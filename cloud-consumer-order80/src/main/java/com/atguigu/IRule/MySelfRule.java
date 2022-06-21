package com.atguigu.IRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ChenCheng
 * @create 2022-06-21 22:58
 */
@Configuration
public class MySelfRule {

    /**
     *   定义随机的负载均衡算法
     * @return
     */
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
