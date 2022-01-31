package com.trivadis.spring.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

//@Configuration
//@ComponentScan(basePackages = "com.trivadis.spring.user")
public class UsermanagementApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(UsermanagementApplication.class, args);

//        UserService userService = applicationContext.getBean(UserService.class);
//        userService.getAllUsers().forEach(System.out::println);
    }


}
