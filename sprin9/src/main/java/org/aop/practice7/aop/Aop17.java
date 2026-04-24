package org.aop.practice7.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop17 {
//    @Before("execution(* *(..))")
//    public void getArgsAdvice(JoinPoint joinPoint) {
//        Object [] args = joinPoint.getArgs();
//        if ((int)args[1] > 18) {
//            System.out.println("LOG age > 18 in method " + joinPoint.getSignature().getName());
//        }
//    }
}
