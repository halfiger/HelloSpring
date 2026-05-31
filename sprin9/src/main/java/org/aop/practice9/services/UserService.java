package org.aop.practice9.services;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void register (String name) {
        System.out.println("User registered: " + name);
    }
}