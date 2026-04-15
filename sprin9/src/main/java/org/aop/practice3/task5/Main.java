package org.aop.practice3.task5;

import org.aop.practice3.task5.filter.PaymentService;
import org.aop.practice3.task5.filter.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        OrderService order = context.getBean(OrderService.class);
        PaymentService payment = context.getBean(PaymentService.class);
        UserService user = context.getBean(UserService.class);

        order.order();
        payment.pay();
        user.registration();

        context.close();
    }
}
