package org.entity.practice1;

public class Main5 {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user1 = userService.updateUserEmail("cookie", 1L);
        User user2 = userService.updateUserName("momo", 4L);
        System.out.println(user1);
        System.out.println(user2);
    }
}