package org.aop.practice2.today5.folder2;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void register(String username) {
        System.out.println("User registered: " + username);
    }
}
