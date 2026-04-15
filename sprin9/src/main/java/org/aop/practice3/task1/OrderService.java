package org.aop.practice3.task1;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void checkout () {
        System.out.println("Order placed");
    }
}
