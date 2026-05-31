package org.aop.practice9.starter;

import org.aop.practice9.config.MyConfig;
import org.aop.practice9.services.filtered.PackageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main5 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        try (context) {
            PackageService packageService = context.getBean(PackageService.class);
            packageService.packageCall();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
