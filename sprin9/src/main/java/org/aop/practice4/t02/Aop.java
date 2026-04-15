package org.aop.practice4.t02;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @After("execution(* pay*(..))")
    public void afterLogging () {
        System.out.println("[LOG] after");
    }
}