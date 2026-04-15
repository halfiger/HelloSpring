package org.aop.practice4.t03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        ReportService reportService = context.getBean(ReportService.class);
        reportService.newReport();
        reportService.report();
        context.close();
    }
}
