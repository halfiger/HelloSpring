package org.aop.practice3.task8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UserList userList = context.getBean(UserList.class);
        System.out.println(userList.myList().toString());
        context.close();
    }
}
