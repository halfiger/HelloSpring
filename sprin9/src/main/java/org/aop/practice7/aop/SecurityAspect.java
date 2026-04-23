package org.aop.practice7.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class SecurityAspect {
    @Around("execution(* *())")
    public Object checkSecurity (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("[Security] checking access");
        return proceedingJoinPoint.proceed();
    }
}
