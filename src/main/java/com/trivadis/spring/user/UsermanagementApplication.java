package com.trivadis.spring.user;

import com.trivadis.spring.user.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class UsermanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsermanagementApplication.class, args);

//        new RestTemplate().postForEntity("http://localhost:8080/user/", )

//        User user = new RestTemplate().getForObject("http://localhost:8080/user/{id}", User.class, 1l);
//        System.out.println(user);
    }


}
