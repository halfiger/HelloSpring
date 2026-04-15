package org.aop.practice3.task5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @After("execution(* org.aop.practice3.task5.filter..*(..))")
    public void myFilter () {
        System.out.println("[APP LOG] method called");
    }
}
