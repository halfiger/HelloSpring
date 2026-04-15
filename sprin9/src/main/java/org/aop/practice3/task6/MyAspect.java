package org.aop.practice3.task6;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @After("execution(public void *der*())")
    public void loggingVoid () {
        System.out.println("[LOG] void AOP");
    }

    @After("execution(public String *der*())")
    public void loggingString () {
        System.out.println("[LOG] String AOP");
    }
}
