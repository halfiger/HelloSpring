package org.aop.practice9.starter;

import org.aop.practice9.config.MyConfig;
import org.aop.practice9.services.PaymentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        try (context) {
            PaymentService paymentService = context.getBean(PaymentService.class);
            paymentService.processPayment();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
