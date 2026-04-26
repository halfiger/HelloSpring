package org.aop.practice7;

import org.aop.practice7.entity.*;
import org.aop.practice7.entity.p1.PackageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main22 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try (context) {
            PackageService packageService = context.getBean(PackageService.class);
            OrderService orderService = context.getBean(OrderService.class);
            packageService.processPackage();
            packageService.processPackage();
            packageService.processPackage();
            orderService.processOrder();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}