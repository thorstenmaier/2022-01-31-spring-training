package com.trivadis.spring.user;

import com.trivadis.spring.user.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication

//@Configuration
//@ComponentScan(basePackages = "com.trivadis.spring.user")
public class UsermanagementApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(UsermanagementApplication.class, args);

        UserService userService = applicationContext.getBean(UserService.class);
        userService.getAllUsers().forEach(System.out::println);
    }


}
