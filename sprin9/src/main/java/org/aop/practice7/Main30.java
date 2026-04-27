package org.aop.practice7;

import org.aop.practice7.entity.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main30 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try(context) {
            UserService userService = context.getBean(UserService.class);
            userService.loginUser("Admin");
            userService.loginUser("dada");
            userService.updateUser("Admin");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
