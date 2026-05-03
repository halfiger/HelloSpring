package org.aop.practice8.starter;

import org.aop.practice8.config.Config;
import org.aop.practice8.services.PaymentService;
import org.aop.practice8.services.UserService;
import org.aop.practice8.services.pac1.PackageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main9 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try(context) {

            PaymentService paymentService = context.getBean(PaymentService.class);
            paymentService.processPayment();
            paymentService.failPay();

        } catch (Exception e) {
            System.out.println("[*] message from main + " + e.getMessage());
        }
    }
}