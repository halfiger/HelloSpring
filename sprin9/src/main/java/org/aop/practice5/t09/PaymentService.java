package org.aop.practice5.t09;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void pay() {
        System.out.println("payment from PaymentService.pay()");
    }

    public void payFail() {
        System.out.println("payment from PaymentService.payFail()");
        throw new IllegalStateException("Payment failed - message from exception");
    }
}
