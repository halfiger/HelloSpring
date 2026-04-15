package org.aop.practice2.today6;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component

public class MyAspect {
    @After("execution(.. void ..(..))")
    public void myVoidAdvice () {
        System.out.println("[LOG] after method wt void return type " + LocalDateTime.now());
    }

    @After("execution(.. void ..(..))")
    public void myStringAdvice () {
        System.out.println("[LOG] after method wt String return type " + LocalDateTime.now());
    }

    @After("execution(public void *Order*())")
    public void myIntAdvice () {
        System.out.println("[LOG] after method wt int return type " + LocalDateTime.now());
    }
}
