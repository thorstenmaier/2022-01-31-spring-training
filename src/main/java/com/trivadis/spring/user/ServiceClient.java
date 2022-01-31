package com.trivadis.spring.user;

import com.trivadis.spring.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import javax.annotation.PostConstruct;

public class ServiceClient implements CommandLineRunner {

    // Field Injection
    @Autowired
    private UserService userService;

    @PostConstruct
    public void init() {
        userService.getAllUsers().forEach(System.out::println);
    }

    @Override
    public void run(String... args) throws Exception {
        userService.getAllUsers().forEach(System.out::println);
    }
}
