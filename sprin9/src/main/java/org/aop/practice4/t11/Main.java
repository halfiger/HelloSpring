package org.aop.practice4.t11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Service service = context.getBean(Service.class);
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
