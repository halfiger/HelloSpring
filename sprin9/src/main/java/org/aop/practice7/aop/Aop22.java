package org.aop.practice7.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop22 {
    @Before("execution(* org.aop.practice7.entity.p1..*(..))")
    public void packageAdvice() {
        System.out.println("Get all methods from package p1 - before method");
    }

}
