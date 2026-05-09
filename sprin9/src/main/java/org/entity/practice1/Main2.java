package org.entity.practice1;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        UserService userService = new UserService();
        List<User> list = userService.findAll();
        for (User user : list) {
            if (user != null) {
                System.out.println(user.toString());
            } else {
                System.out.println("User not found");
            }
        }
    }
}
