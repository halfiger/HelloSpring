package org.aop.practice3.task5.filter;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void pay () {
        System.out.println("user paying");
    }
}
