package org.aop.practice3.task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        PaymentService service = context.getBean(PaymentService.class);
        service.processPayment();
        context.close();
    }
}