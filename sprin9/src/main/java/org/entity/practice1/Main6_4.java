package org.entity.practice1;

import java.util.List;

public class Main6_4 {
    public static void main(String[] args) {
        UserService userService = new UserService();
        List<User> list = userService.findByNameContains("ra");
        System.out.println(list);
    }
}
