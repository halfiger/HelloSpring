package org.aop.practice2.today3;

import org.springframework.stereotype.Component;

@Component
public class GenerateReport {
    public void generateReport () {
        System.out.println("Generating report...");
    }
}