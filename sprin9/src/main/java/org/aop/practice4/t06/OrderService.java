package org.aop.practice4.t06;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public int getOrder() {
        System.out.println("get order method");
        return 7;
    }

    public String getOrderStatus () {
        System.out.println("get order status method");
        return "status";
    }

    public void processOrder () {
        System.out.println("process order method");
    }
}
