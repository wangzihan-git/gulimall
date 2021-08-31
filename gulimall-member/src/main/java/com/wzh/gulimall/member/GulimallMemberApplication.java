package com.wzh.gulimall.member;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @MapperScan 表示扫描的dao层的包(本质上是与xml文件对应的)
 * @EnableFeignClients 表示开启远程调用服务,参数表示承接远程调用的接口的包名
 * @EnableDiscoveryClient 表示开启服务注册与发现
 */

@MapperScan("com.wzh.gulimall.member.dao")
@EnableFeignClients(basePackages="com.wzh.gulimall.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
