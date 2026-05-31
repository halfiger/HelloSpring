package org.aop.practice9.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop3 {
    @Around("execution (* *())")
    public Object aroundAspect (ProceedingJoinPoint point) throws Throwable {
        System.out.println("[START]");
        Object o = point.proceed();
        System.out.println("[END]");
        return o;
    }

}
