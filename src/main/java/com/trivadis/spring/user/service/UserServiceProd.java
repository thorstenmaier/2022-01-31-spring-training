package com.trivadis.spring.user.service;

import com.trivadis.spring.user.Duration;
import com.trivadis.spring.user.domain.LogEntry;
import com.trivadis.spring.user.domain.User;
import com.trivadis.spring.user.repository.LogEntryRepository;
import com.trivadis.spring.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

public class UserServiceProd implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private LogEntryRepository logEntryRepository;

    @PostConstruct
    public void init() {
        System.out.println(userRepository.getClass());
        userRepository.save(new User("Thorsten", "Maier"));
    }

    @Transactional(readOnly = true)
    public void createUser(User user) {
        logEntryRepository.save(new LogEntry("User created"));
        userRepository.save(user);
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    @Duration
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
