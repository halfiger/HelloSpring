package org.aop.practice2.today7;

import org.aop.practice2.today7.repository.Test1;
import org.aop.practice2.today7.service.Test2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Test1 repo =  context.getBean(Test1.class);
        Test2 serv = context.getBean(Test2.class);
        repo.check();
        serv.check();
        context.close();
    }
}
