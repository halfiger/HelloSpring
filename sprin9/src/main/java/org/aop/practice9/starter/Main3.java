package org.aop.practice9.starter;

import org.aop.practice9.config.MyConfig;
import org.aop.practice9.services.ReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        try (context) {
            ReportService reportService = context.getBean(ReportService.class);
            reportService.generateReport();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
