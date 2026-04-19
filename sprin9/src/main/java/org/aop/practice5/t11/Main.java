package org.aop.practice5.t11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserService service = context.getBean(UserService.class);
        try {
            service.create();
            service.delete();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            context.close();
        }
    }
}
