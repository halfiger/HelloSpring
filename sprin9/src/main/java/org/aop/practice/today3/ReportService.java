package org.aop.practice.today3;

import org.springframework.stereotype.Component;

@Component ()
public class ReportService {
    public void generateReport() {
        System.out.println("Generating report...");
    }
}
