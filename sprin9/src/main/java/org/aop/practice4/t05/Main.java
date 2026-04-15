package org.aop.practice4.t05;

import org.aop.practice4.t05.p1.OrderService;
import org.aop.practice4.t05.p2.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        UserService userService = context.getBean(UserService.class);
        OrderService orderService = context.getBean(OrderService.class);
        userService.register("kaka");
        orderService.order();
    }
}
