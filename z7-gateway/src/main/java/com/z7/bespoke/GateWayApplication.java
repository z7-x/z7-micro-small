package com.z7.bespoke;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：z7-micro-small
 * 类 名 称：GateWayApplication
 * 类 描 述：TODO 网关配置启动类
 * 创建时间：2023/3/8 5:55 下午
 * 创 建 人：z7
 */
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class GateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }


    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/foo")
    public String hi() {
        return foo;
    }

}
