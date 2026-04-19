package org.aop.practice5.t09;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.pay();

        try {
            paymentService.payFail();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            context.close();
        }
    }
}