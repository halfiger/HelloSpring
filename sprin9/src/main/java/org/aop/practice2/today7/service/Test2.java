package org.aop.practice2.today7.service;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Test2 {
    public void check () {
        System.out.println("hello from service folder " + LocalDateTime.now());
    }
}
