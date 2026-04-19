package org.aop.practice5.t04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        UserService service = context.getBean(UserService.class);
        service.register("dada");
        context.close();
    }
}