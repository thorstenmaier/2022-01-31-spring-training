package com.trivadis.spring.user.service;

import com.trivadis.spring.user.domain.User;
import com.trivadis.spring.user.repository.LogEntryRepository;
import com.trivadis.spring.user.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
public class UserServiceTest {

  @Autowired
  private UserService userService;
  @Autowired private LogEntryRepository logEntryRepository;
  @Autowired private UserRepository userRepository;

  @Test
  public void testTransactional() {
    userRepository.deleteAll();
    assertEquals(0, userRepository.count());
    assertEquals(0, logEntryRepository.count());
    
    userService.createUser(createUserWithLastname("Maier"));
    assertEquals(1, userRepository.count());
    assertEquals(1, logEntryRepository.count());

    try {
      userService.createUser(createUserWithLastname("Maier"));
      fail("Exception should be thrown");
    } catch (DataAccessException e) {
      assertEquals(1, userRepository.count());
      assertEquals(1, logEntryRepository.count());
    }
  }

  private User createUserWithLastname(String lastname) {
    User user = new User(); user.setLastname(lastname); return user;
  }
}
