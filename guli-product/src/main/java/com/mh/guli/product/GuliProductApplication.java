package com.mh.guli.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/***
 * 整合mybatisplus
 * 1. 依赖
 * 2. 数据源配置
 * 3. mapperscan
 * 4. xml配置
 */
@MapperScan("com.mh.guli.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class GuliProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliProductApplication.class, args);
    }

}
