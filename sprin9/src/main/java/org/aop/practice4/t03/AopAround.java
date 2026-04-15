package org.aop.practice4.t03;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class AopAround {
    @Around("execution(* *(..))")
    public Object loggingAround (ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[START] log" + LocalDateTime.now());
        Object o = joinPoint.proceed();
        System.out.println("[SEND] log" + LocalDateTime.now());
        return o;
    }
}
