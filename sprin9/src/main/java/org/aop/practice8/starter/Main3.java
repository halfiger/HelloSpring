package org.aop.practice8.starter;

import org.aop.practice8.config.Config;
import org.aop.practice8.services.ReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try(context) {

            ReportService reportService = context.getBean(ReportService.class);
            reportService.processReport();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}