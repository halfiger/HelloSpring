package org.aop.practice4.t01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        OrderService order = context.getBean(OrderService.class);
        order.check();
        context.close();
    }
}
