package org.aop.practice7;

import org.aop.practice7.entity.p1.PackageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        PackageService packageService = context.getBean(PackageService.class);
        try (context) {
            packageService.processPackage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}