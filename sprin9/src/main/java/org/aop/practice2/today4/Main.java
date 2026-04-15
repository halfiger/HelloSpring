package org.aop.practice2.today4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UserInterface user = context.getBean(UserInterface.class);
        user.register("men");
        context.close();
    }
}