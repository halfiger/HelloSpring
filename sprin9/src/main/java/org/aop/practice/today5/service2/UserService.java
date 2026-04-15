package org.aop.practice.today5.service2;

import org.springframework.stereotype.Component;

@Component("userService")
public class UserService {
    public void register(String username) {
        System.out.println("User registered: " + username);
    }
}