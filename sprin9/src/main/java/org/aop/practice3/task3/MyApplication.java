package org.aop.practice3.task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        ReportService service = context.getBean(ReportService.class);
        service.generateReport();
        context.close();
    }
}
