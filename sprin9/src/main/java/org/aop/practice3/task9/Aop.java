package org.aop.practice3.task9;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @AfterThrowing (
        pointcut = "execution(* org.aop.practice3.task9.Service.pay(..))",
        throwing = "ex"
    )
    public void afterTrowingAdvice (IllegalStateException ex) {
        System.out.println("[ERROR] Exception: " + ex.getMessage());
    }
}
