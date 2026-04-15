package org.aop.practice3.task6;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void orderVoid() {
        System.out.println("void order done");
    }

    public String orderString() {
        System.out.println("String order done");
        return "";
    }
}
