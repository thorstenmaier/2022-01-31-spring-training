package com.trivadis.spring.user.service;

import com.trivadis.spring.user.ServiceClient;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

// 1. Wird nicht mehr durch Component Scan gefunden
// 2. Die Standard-Konfig wird nicht ersetzt sondern erweitert
@TestConfiguration
public class UserServiceTestConfig {

    @Bean
    public UserService userService3() {
        return new UserServiceImpl();
    }
}
