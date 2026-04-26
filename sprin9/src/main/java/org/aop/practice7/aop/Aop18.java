package org.aop.practice7.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop18 {
//    @Around("execution(* *..updateAndReturnUser(..))")
//    public Object upper(ProceedingJoinPoint joinPoint) throws Throwable {
//        String result = (String) joinPoint.proceed();
//        return result.toUpperCase();
//    }
}
