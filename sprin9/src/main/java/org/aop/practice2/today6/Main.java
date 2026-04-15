package org.aop.practice2.today6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        OrderService service = context.getBean(OrderService.class);
        service.getOrderId();
        service.getOrderStatus();
        service.processOrder();
        context.close();
    }
}
