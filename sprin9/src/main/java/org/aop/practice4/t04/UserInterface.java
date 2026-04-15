package org.aop.practice4.t04;

import org.springframework.stereotype.Component;

@Component
public class UserInterface {
    public void register(String username) {
        System.out.println("user registered " + username);
    }
}
