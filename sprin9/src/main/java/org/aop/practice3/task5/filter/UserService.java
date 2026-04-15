package org.aop.practice3.task5.filter;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void registration () {
        System.out.println("user registered");
    }
}
