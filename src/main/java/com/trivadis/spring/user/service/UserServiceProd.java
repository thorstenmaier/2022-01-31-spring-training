package com.trivadis.spring.user.service;

import com.trivadis.spring.user.domain.User;

import java.util.Arrays;
import java.util.List;

public class UserServiceProd implements UserService {

    public UserServiceProd() {
        System.out.println("#####");
    }

    @Override
    public List<User> getAllUsers() {
        return Arrays.asList(
                new User("PROD", "PROD"));
    }
}
