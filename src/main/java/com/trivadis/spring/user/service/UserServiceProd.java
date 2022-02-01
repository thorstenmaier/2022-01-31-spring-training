package com.trivadis.spring.user.service;

import com.trivadis.spring.user.domain.User;
import org.springframework.beans.factory.annotation.Value;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceProd implements UserService {

    @Value("${user.firstnames}")
    public String[] firstnames;

    public UserServiceProd() {
        System.out.println("#####");
    }

    @Override
    public List<User> getAllUsers() {
        return Arrays.stream(firstnames).map(f -> new User(f, f)).collect(Collectors.toList());
    }
}
