package org.entity.practice1;

import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        UserService userService = new UserService();
        List<User> users = userService.pagination(0, 3);
        for (User user : users) {
            if (user != null) {
                System.out.println(user.toString());
            } else {
                System.out.println("User not found");
            }
        }
    }
}