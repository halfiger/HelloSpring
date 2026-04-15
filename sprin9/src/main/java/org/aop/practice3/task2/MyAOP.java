package org.aop.practice3.task2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAOP {
    @After("execution(public void *Pay*())")
    public void paymentLogging () {
        System.out.println("[LOG] Payment finished");
    }
}
