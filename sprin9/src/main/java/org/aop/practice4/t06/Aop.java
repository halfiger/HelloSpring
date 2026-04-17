package org.aop.practice4.t06;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @After("execution(int *Order*())")
    public void aspectInt () {
        System.out.println("Log int");
    }
    @After("execution(String *Order*())")
    public void aspectString () {
        System.out.println("Log String");
    }

    @After("execution(void *Order*())")
    public void aspectVoid () {
        System.out.println("Log void");
    }
}
