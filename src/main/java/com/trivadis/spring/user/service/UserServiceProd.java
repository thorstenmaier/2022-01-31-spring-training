package com.trivadis.spring.user.service;

import com.trivadis.spring.user.Duration;
import com.trivadis.spring.user.domain.User;
import com.trivadis.spring.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

public class UserServiceProd implements UserService {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init() {
        System.out.println(userRepository.getClass());
        userRepository.save(new User("Thorsten", "Maier"));

    }

    @Override
    @Duration
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
