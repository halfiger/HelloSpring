package org.aop.practice4.t01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @Before("execution(* *(..))")
    public void checkOut () {
        System.out.println("[LOG] before");
    }
}
