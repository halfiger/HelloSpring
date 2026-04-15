package org.aop.practice2.today1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        OrderService service = context.getBean(OrderService.class);
        service.checkout();
        context.close();
    }
}
