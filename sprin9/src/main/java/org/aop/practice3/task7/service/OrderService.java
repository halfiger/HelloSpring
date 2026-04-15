package org.aop.practice3.task7.service;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void order () {
        System.out.println("order service");
    }
}