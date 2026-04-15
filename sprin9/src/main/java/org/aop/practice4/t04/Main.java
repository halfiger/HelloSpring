package org.aop.practice4.t04;

import h.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        UserInterface user = context.getBean(UserInterface.class);
        user.register("Yata");
        context.close();
    }
}
