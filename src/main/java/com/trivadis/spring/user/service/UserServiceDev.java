package com.trivadis.spring.user.service;

import com.trivadis.spring.user.domain.User;

import java.util.Arrays;
import java.util.List;

public class UserServiceDev implements UserService {

    public UserServiceDev() {
        System.out.println("#####");
    }

    @Override
    public List<User> getAllUsers() {
        return Arrays.asList(
                new User("Guenther", "Nubert"),
                new User("Bud", "Spencer"),
                new User("Dieter", "Develop"));
    }
}
