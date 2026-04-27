package org.aop.practice7;

import org.aop.practice7.entity.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main29 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try (context) {
            UserService userService = context.getBean(UserService.class);
            userService.updateUser("dada");
            userService.updateUser("ADMIN");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
