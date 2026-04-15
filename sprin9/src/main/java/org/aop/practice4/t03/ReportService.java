package org.aop.practice4.t03;

import org.springframework.stereotype.Component;

@Component
public class ReportService {
    public void report () {
        System.out.println("generating report");
    }
    public void newReport () {
        System.out.println("generating new report");
    }
}