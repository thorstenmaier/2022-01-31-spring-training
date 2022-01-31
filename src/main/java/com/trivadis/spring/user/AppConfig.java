package com.trivadis.spring.user;

import com.trivadis.spring.user.service.UserService;
import com.trivadis.spring.user.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public ServiceClient serviceClient() {
        return new ServiceClient();
    }
}
