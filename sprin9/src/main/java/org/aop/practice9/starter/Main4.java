package org.aop.practice9.starter;

import org.aop.practice9.config.MyConfig;
import org.aop.practice9.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        try (context) {
            UserService userService = context.getBean(UserService.class);
            userService.register("dada");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}