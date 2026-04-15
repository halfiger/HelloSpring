package org.aop.practice.today2;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void processPayment() {
        System.out.println("Payment done");
    }
}
