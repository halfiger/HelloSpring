package org.aop.practice7;

import org.aop.practice7.entity.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main18 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try (context) {
            UserService userService = context.getBean(UserService.class);
            System.out.println(userService.updateAndReturnUser("dada"));
            System.out.println(userService.updateAndReturnUser("gaga"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}