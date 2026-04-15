package org.aop.practice3.task7.repository;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void pay () {
        System.out.println("user paying");
    }
}
