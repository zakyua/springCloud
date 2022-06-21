package com.atguigu.springCloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ChenCheng
 * @create 2022-06-21 23:03
 */
@Component
public class MyLB implements LoadBalancer{

    // 原子计数
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     *  返回当前访问的一个次数
     * @return
     */
    public final int getAndIncrement(){
            int current; // 默认从开始计数
            int next;  // 访问当前服务的次数
            do {
                current = this.atomicInteger.get();
                next = current >= 2147483647 ? 0 : current + 1;
            }while(!this.atomicInteger.compareAndSet(current,next));
            return next;
       }



    // 负载均衡算法：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标,
    // 每次服务重启动后rest接口计数从1开始。
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {

        // 计算出要选择哪一个服务进行访问
        int index = getAndIncrement() % serviceInstances.size();
        ServiceInstance serviceInstance = serviceInstances.get(index);
        return serviceInstance;
    }
}
