package org.aop.practice2.today8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UserList userList = context.getBean(UserList.class);
        System.out.println(userList.myList().toString());
        context.close();
    }
}
