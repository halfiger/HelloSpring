package org.aop.practice9.services;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void processPayment () {
        System.out.println("message from method processPayment");
    }
}
