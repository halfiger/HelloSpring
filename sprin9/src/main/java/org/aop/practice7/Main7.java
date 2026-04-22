package org.aop.practice7;

import org.aop.practice7.entity.*;
import org.aop.practice7.entity.p1.PackageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try (context) {
            PackageService packageService = context.getBean(PackageService.class);
            PaymentService paymentService = context.getBean(PaymentService.class);

            packageService.processPackage();
            paymentService.processPayment();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}