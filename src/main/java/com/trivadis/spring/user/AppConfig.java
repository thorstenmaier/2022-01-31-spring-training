package com.trivadis.spring.user;

import com.trivadis.spring.user.service.UserService;
import com.trivadis.spring.user.service.UserServiceProd;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService1() {
        return new UserServiceProd();
    }

    @Bean
    public ServiceClient serviceClient(UserService userService) {
        return new ServiceClient(userService);
    }
}
