package com.trivadis.spring.user.service;

import com.trivadis.spring.user.ServiceClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.*;

//@ExtendWith(SpringExtension.class)
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetAllUsers() {
        assertEquals(3, userService.getAllUsers().size());
    }

    // 1. Wird nicht mehr durch Component Scan gefunden
    // 2. Die Standard-Konfig wird nicht ersetzt sondern erweitert
    @Configuration
    public static class UserServiceTestConfig {
        @Bean
        public UserService userService3() {
            return new UserServiceImpl();
        }
    }


}