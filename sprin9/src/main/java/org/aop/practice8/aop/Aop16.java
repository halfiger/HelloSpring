package org.aop.practice8.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop16 {
    @Around("execution(* *(..))")
    public Object stoppingAspect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("attempting to call method ---> " + pjp.getSignature().getName());
        String userName = (String) pjp.getArgs()[0];
        if (userName == null || userName.isEmpty()) {
            System.out.println("danger method regected");
            return null;
        }
        System.out.println("method accepted");
        return pjp.proceed();
    }
}