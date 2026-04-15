package org.aop.practice3.task5;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void order () {
        System.out.println("user ordered not for aop call");
    }
}
