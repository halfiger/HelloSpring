package org.aop.practice4.t05.p1;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void order () {
        System.out.println("order comleted");
    }
}
