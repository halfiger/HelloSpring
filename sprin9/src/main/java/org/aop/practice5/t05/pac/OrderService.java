package org.aop.practice5.t05.pac;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void order () {
        System.out.println("order from [PAC]");
    }
}