package org.aop.practice3.task7.repository;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void registration () {
        System.out.println("user registered");
    }
}
