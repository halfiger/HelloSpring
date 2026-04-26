package org.aop.practice7;

import org.aop.practice7.entity.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main19 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try (context) {
            PaymentService paymentService = context.getBean(PaymentService.class);
            paymentService.processPayment();
            paymentService.failPayment();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}