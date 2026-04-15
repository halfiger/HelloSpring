package org.aop.practice3.task3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAOP {
    @Around("execution(public void *Rep*())")
    public Object reportAround (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Start");
        Object object = proceedingJoinPoint.proceed();
        System.out.println("End");
        return object;
    }
}
