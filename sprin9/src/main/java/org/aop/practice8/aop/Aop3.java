package org.aop.practice8.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class Aop3 {
    @Around("execution(* *())")
    public Object aroundAspect (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("[LOG] start " + LocalDateTime.now());
        Object o = proceedingJoinPoint.proceed();
        System.out.println("[LOG] end " + LocalDateTime.now());
        return o;
    }
}