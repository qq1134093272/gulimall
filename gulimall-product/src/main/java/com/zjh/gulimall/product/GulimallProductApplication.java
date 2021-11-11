package com.zjh.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 2、逻辑删除
 *  1）、配置全局的逻辑删除规则（省略）
 *  2）、低版本需要配置逻辑删除的组件Bean（省略）
 *  3）、加上逻辑删除注解——实体类字段（showStatus）上加上@TableLogic注解
 */


@EnableFeignClients(basePackages = "com.zjh.gulimall.product.feign")
@MapperScan("com.zjh.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
