package org.aop.practice5.t11;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @Around("execution(* *())")
    public Object blockMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        if (joinPoint.getSignature().getName().contains("delete")) {
            throw new RuntimeException("[Blocked] dangerous method");
        }
        return joinPoint.proceed();
    }
}
