package org.aop.practice3.task9;

import org.springframework.stereotype.Component;

@Component
public class Service {
    public void pay() {
        throw new IllegalStateException("Payment failed");
    }
}
