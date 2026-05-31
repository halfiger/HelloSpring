package org.aop.practice9.services;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void processOrder () {
        System.out.println("Order method from OrderService class");
    }
}
