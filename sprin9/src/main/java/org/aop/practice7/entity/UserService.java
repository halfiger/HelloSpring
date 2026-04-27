package org.aop.practice7.entity;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    public void processRegistration (String username) {
        System.out.println("User registered: " + username);
    }

    public List<String> getUsers () {
        System.out.println("getting users in getUsers method");
        return List.of("dada", "anna");
    }

    @Loggable
    public void saveUser () {
        System.out.println("save method in UserService class");
    }

    @Loggable
    public void loginUser (String username) {
        System.out.println("user " + username + " logged in");
    }

    public String deleteAllUsers () {
        System.out.println("try to remove all users from db");
        return "all data removed";
    }

    public void updateUser (String username) {
        System.out.println("try to update username, new username = " + username);
    }

    public String updateAndReturnUser (String username) {
        System.out.println("try to update username, new username = " + username);
        return username;
    }

    public void createUser (String name, int age) {
        System.out.println("User created, name = " + name + " , age = " + age);
    }

    public String getData() {
        throw new RuntimeException("fail");
    }

    void setData() {
        System.out.println("data configured");
    }

    public void loadData () {
        System.out.println("data relocated");
    }
}