package org.aop.practice8.services;

import org.springframework.stereotype.Component;

@Component
public class ReportService {
    public void processReport() {
        System.out.println("processing report");
    }
}