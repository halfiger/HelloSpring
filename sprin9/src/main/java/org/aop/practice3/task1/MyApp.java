package org.aop.practice3.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        OrderService service = context.getBean(OrderService.class);
        service.checkout();
        context.close();
    }
}
