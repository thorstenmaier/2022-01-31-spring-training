package com.trivadis.spring.user.service;

import com.trivadis.spring.user.domain.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void createUser(User user);

    User findUserById(Long id);
}
