package com.trivadis.spring.user;

import com.trivadis.spring.user.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class ServiceClient {

    public ServiceClient(UserService userService) {
        userService.getAllUsers().forEach(System.out::println);
    }
}
