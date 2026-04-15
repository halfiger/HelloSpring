package org.aop.practice.today1;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void checkout() {
        System.out.println("Order placed");
    }
}

