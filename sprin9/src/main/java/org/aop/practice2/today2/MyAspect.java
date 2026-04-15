package org.aop.practice2.today2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @After("execution(public void processPayment())")
    public void afterPaymentAspecting () {
        System.out.println("[LOG] Payment finished");
    }
}
