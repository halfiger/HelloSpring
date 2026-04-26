package org.aop.practice7.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Aspect
@Component
public class Aop20 {
//    @Around("execution(* *())")
//    public Object timeAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        LocalDateTime time1 = LocalDateTime.now();
//        Object o = proceedingJoinPoint.proceed();
//        LocalDateTime time2 = LocalDateTime.now();
//
//        System.out.println("Method name: " +
//                proceedingJoinPoint.getSignature().getName() + " took " +
//                Duration.between(time1, time2).toMillis() + " ms");
//        return o;
//    }
}
