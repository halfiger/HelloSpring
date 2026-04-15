package org.aop.practice4.t01;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void check() {
        System.out.println("order placed");
    }
}
