package org.aop.practice4.t02;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void payment() {
        System.out.println("payment done");
    }
}
