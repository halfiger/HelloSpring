package org.aop.practice3.task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UserService service = context.getBean(UserService.class);
        service.register("john");
        context.close();
    }
}
