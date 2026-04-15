package org.aop.practice2.today4;

import org.springframework.stereotype.Component;

@Component
public class UserInterface {
    public void register (String username) {
        System.out.println("user registered: " + username);
    }
}
