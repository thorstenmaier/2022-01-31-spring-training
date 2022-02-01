package com.trivadis.spring.user;

import com.trivadis.spring.user.service.UserService;
import com.trivadis.spring.user.service.UserServiceDev;
import com.trivadis.spring.user.service.UserServiceProd;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Bean
    @Profile("prod")
    public UserService userService1() {
        return new UserServiceProd();
    }

    @Bean
    @Profile("dev")
    public UserService userService2() {
        return new UserServiceDev();
    }

    @Bean
    public ServiceClient serviceClient(UserService userService) {
        return new ServiceClient(userService);
    }
}
