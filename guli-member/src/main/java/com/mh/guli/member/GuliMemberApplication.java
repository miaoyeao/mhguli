package com.mh.guli.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.mh.guli.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GuliMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliMemberApplication.class, args);
    }

}
