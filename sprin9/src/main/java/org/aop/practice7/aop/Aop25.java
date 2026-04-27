package org.aop.practice7.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop25 {
    @Around("execution(* *..getData(..))")
    public Object throwingAdvice (ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        try {
            return proceedingJoinPoint.proceed();
        } catch (RuntimeException e) {
            System.out.println("[Error] fallback");
            return "fallback";
        }
    }
}