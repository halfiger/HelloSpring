package org.entity.practice1;

public class Main6_2 {
    public static void main(String[] args) {
        UserService userService = new UserService();
        //User user1 = userService.findByEmail(null);
        User user2 = userService.findByEmail("nowa");
        //System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
