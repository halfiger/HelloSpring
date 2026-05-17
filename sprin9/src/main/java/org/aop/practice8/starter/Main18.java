package org.aop.practice8.starter;

import org.aop.practice8.config.Config;
import org.aop.practice8.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main18 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try(context) {
            UserService userService = context.getBean(UserService.class);
            System.out.println(userService.description("welter"));
            System.out.println(userService.description("dada"));
            System.out.println(userService.description("baba"));

        } catch (Exception e) {
            System.out.println("[*] message from main + " + e.getMessage());
        }
    }
}