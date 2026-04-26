package org.aop.practice7;

import org.aop.practice7.entity.*;
import org.aop.practice7.entity.p1.PackageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main23 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try (context) {
        UserService userService = context.getBean(UserService.class);
        userService.saveUser();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}