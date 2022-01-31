package com.trivadis.spring.user.service;

import com.trivadis.spring.user.domain.User;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
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
