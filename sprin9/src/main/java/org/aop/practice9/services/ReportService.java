package org.aop.practice9.services;

import org.springframework.stereotype.Component;

@Component
public class ReportService {
    public void generateReport () {
        System.out.println("Generating report...");
    }
}
