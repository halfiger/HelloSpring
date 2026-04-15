package org.aop.practice4.t02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.payment();
        context.close();
    }
}
