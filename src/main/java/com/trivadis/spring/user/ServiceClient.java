package com.trivadis.spring.user;

import com.trivadis.spring.user.service.UserService;
import org.springframework.boot.CommandLineRunner;

import javax.annotation.PostConstruct;

public class ServiceClient implements CommandLineRunner {

    //    @Autowired
    private UserService userService;

    public ServiceClient(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void init() {
        userService.getAllUsers().forEach(System.out::println);
    }

    @Override
    public void run(String... args) throws Exception {
        userService.getAllUsers().forEach(System.out::println);
    }
}
