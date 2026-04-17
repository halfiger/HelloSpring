package org.aop.practice4.t06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

    public class Main {
        public static void main(String[] args) {
            AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(Config.class);
            OrderService order = context.getBean(OrderService.class);
            order.getOrderStatus();
            order.processOrder();
            order.getOrder();
            context.close();
        }
    }
