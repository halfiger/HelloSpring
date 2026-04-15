package org.aop.practice4.t05.p2;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void register(String name) {
        System.out.println("registered user: " + name);
    }
}
