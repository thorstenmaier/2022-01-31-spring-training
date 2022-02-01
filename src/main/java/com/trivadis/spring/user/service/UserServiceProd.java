package com.trivadis.spring.user.service;

import com.trivadis.spring.user.Duration;
import com.trivadis.spring.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationContext;

import javax.annotation.security.RolesAllowed;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceProd implements UserService {

    @Value("${user.firstnames}")
    public String[] firstnames;

    @Autowired
    private ApplicationContext applicationContext;

    public UserServiceProd() {
        System.out.println("#####");
    }

    @Override
    @Duration
    public List<User> getAllUsers() {
        System.out.println("*****");
        return applicationContext.getBean(UserServiceProd.class).getInternalAllUsers();
    }

    @Duration
    public List<User> getInternalAllUsers() {
        return Arrays.stream(firstnames).map(f -> new User(f, f)).collect(Collectors.toList());
    }
}
