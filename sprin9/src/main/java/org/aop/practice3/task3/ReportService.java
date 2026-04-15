package org.aop.practice3.task3;

import org.springframework.stereotype.Component;

@Component
public class ReportService {
    public void generateReport () {
        System.out.println("Generating report");
    }
}
