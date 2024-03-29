package com.nvwa.remote.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：liuzhaolu
 * @description：TODO
 * @prd :
 * @date ：2022/1/11 5:44 下午
 * @Modification Date         Author          Description
 * ------------------------------------------ *
 * 2022/1/11 5:44 下午     liuzhaolu       firstVersion
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.nvwa")
public class DubboConsumerConfig {
//    @Bean // 应用配置
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("dubbo-annotation-consumer");
//        Map<String, String> stringStringMap = new HashMap<String, String>();
//        stringStringMap.put("qos.enable","true");
//        stringStringMap.put("qos.accept.foreign.ip","false");
//        stringStringMap.put("qos.port","33333");
//        applicationConfig.setParameters(stringStringMap);
//        return applicationConfig;
//    }

    @Bean // 服务消费者配置
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(3000);
        return consumerConfig;
    }

//    @Bean // 配置注册中心
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setProtocol("zookeeper");
//        registryConfig.setAddress("localhost");
//        registryConfig.setPort(2181);
//        return registryConfig;
//    }
}
