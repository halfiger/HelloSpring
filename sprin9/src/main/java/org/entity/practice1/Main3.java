package org.entity.practice1;

import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        UserService userService = new UserService();
        List<User> list = userService.findUsersOlderThan(33);
        for (User user : list) {
            if (user != null) {
                System.out.println(user.toString());
            } else {
                System.out.println("User not found");
            }
        }
    }
}