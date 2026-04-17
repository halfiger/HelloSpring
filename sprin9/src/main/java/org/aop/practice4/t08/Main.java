package org.aop.practice4.t08;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Users users = context.getBean(Users.class);
        System.out.println(users.myList().toString());
        context.close();
    }
}
