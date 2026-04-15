package org.aop.practice2.today3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        GenerateReport report = context.getBean(GenerateReport.class);
        report.generateReport();
        context.close();
    }
}