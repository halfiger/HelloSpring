package org.aop.practice4.t11;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @Around("execution(* *(..))")
    public Object blocking (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        if (proceedingJoinPoint.getSignature().getName().contains("delete")) {
            throw new RuntimeException("dangerous method");
        }
            return proceedingJoinPoint.proceed();
    }
}
