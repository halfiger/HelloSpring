package org.aop.practice3.task6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        OrderService ordering = context.getBean(OrderService.class);
        ordering.orderVoid();
        ordering.orderString();
        ordering.orderVoid();
        context.close();
    }
}