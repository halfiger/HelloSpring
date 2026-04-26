package org.aop.practice7.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop21 {
//    @Around("execution(* *(..))")
//    public Object changeCase (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//
//        Object [] args = proceedingJoinPoint.getArgs();
//        if (args[0] == null) {
//            return null;
//        }
//
//        System.out.println("LOG before");
//        String o = (String)proceedingJoinPoint.proceed();
//        System.out.println("LOG after");
//        return o.toUpperCase();
//    }
}