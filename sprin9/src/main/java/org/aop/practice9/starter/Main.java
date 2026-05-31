package org.aop.practice9.starter;

import org.aop.practice9.config.MyConfig;
import org.aop.practice9.services.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        try (context) {
            OrderService orderService = context.getBean(OrderService.class);
            orderService.processOrder();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
