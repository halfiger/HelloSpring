package org.entity.practice1;

public class Main6 {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.deleteById(6L);
        userService.findAll();
    }
}