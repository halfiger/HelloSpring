package org.aop.practice2.today5.folder2;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void processPayment() {
        System.out.println("Payment done");
    }

}
