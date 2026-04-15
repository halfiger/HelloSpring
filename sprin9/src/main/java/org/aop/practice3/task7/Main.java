package org.aop.practice3.task7;

import org.aop.practice3.task7.service.OrderService;
import org.aop.practice3.task7.repository.PaymentService;
import org.aop.practice3.task7.repository.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        PaymentService paymentService = context.getBean(PaymentService.class);
        UserService userService = context.getBean(UserService.class);
        OrderService orderService = context.getBean(OrderService.class);

        paymentService.pay();
        userService.registration();
        orderService.order();
    }
}
