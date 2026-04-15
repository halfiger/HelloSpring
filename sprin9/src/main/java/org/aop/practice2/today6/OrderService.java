package org.aop.practice2.today6;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public int getOrderId() {
        System.out.println("get 1");
        return 1;
    }
    public String getOrderStatus() {
        System.out.println("get 2");
        return "two";
    }
    public void processOrder() {
        System.out.println("get3 nothing return");
    }
}
