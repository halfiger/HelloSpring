package org.aop.practice.today4;

import org.springframework.stereotype.Component;

@Component ("userService")
public class UserService {
    public void register(String username) {
        System.out.println("User registered: " + username);
    }
}
