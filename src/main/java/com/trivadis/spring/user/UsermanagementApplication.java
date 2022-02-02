package com.trivadis.spring.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class UsermanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsermanagementApplication.class, args);
    }


}
