package org.aop.practice2.today7.repository;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Test1 {
    public void check() {
        System.out.println("hello from repository folder " + LocalDateTime.now());
    }
}
