package org.aop.practice3.task9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Service service = context.getBean(Service.class);
        try {
            service.pay();
        } catch (RuntimeException e)
        {
            e.printStackTrace();
        }
        context.close();
    }
}
