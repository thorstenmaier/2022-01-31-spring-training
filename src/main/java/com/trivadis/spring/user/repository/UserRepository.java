package com.trivadis.spring.user.repository;

import com.trivadis.spring.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByLastnameOrderByFirstnameDesc(String lastname);

    List<User> findByLastname(String lastname);

    List<User> findByAddressCity(String city);
}
