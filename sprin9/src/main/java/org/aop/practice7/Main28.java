package org.aop.practice7;

import org.aop.practice7.entity.p1.*;
import org.aop.practice7.entity.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main28 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try (context) {
            PackageService packageService = context.getBean(PackageService.class);
            packageService.processPackage();

            UserService userService = context.getBean(UserService.class);
            userService.loadData();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}