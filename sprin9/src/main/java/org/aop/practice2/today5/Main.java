package org.aop.practice2.today5;

import org.aop.practice2.today5.folder1.OrderService;
import org.aop.practice2.today5.folder2.UserService;
import org.aop.practice2.today5.folder2.PaymentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        OrderService order = context.getBean(OrderService.class);
        UserService user = context.getBean(UserService.class);
        PaymentService payment = context.getBean(PaymentService.class);

        order.checkout();
        user.register("bo");
        payment.processPayment();
                context.close();
    }
}
