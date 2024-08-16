package com.z7.bespoke.discovery;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 项目名称：z7-micro-small
 * 类 名 称：DiscoveryApplication
 * 类 描 述 注册服务启动类
 * 创建时间：2024/8/27 11:10 上午
 * @author z7
 */
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplication.class, args);
//        在 Spring Boot 2.4 版本以后，bootstrap.yml 的加载机制有所变化。如果你升级到 Spring Boot 2.7.x，但项目中未正确配置 Spring Cloud 的加载机制，可能会导致 bootstrap.yml 无法加载。
//        new SpringApplicationBuilder(DiscoveryApplication.class)
//                .properties("spring.config.name:bootstrap")
//                .build()
//                .run(args);
    }
}