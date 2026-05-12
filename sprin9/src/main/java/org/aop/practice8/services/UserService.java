package org.aop.practice8.services;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    public void register (String username) {
        System.out.println("User registered as: " + username);
    }

    public String description (String descr) {
        System.out.println("added description " + descr);
        return descr;
    }

    public List<String> getUsers () {
        return List.of("dada", "ada", "madaam");
    }

    public boolean updateUser (String name) {
        System.out.println("user updated, new name = " + name);
        return true;
    }
}
