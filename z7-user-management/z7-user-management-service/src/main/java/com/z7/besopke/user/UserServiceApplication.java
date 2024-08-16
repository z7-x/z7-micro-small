package com.z7.besopke.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserServiceApplication
 * @Description: 用户启动类
 * @Date: 2024-08-15 11:54
 * @Author: z7
 **/
@EnableEurekaClient
@SpringBootApplication
@RestController
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
