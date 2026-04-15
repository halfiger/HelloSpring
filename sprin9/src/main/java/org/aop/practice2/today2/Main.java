package org.aop.practice2.today2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        PaymentService service = context.getBean(PaymentService.class);
        service.processPayment();
        context.close();
    }
}
