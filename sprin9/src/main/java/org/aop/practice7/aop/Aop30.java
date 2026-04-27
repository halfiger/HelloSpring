package org.aop.practice7.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop30 {
//    @Around("@annotation(org.aop.practice7.entity.Loggable) && args(username)")
//    public Object loginAdvice(ProceedingJoinPoint proceedingJoinPoint, String username) throws Throwable {
//        if (!username.equals("Admin")) {
//            System.out.println("[DENIED]");
//            throw new RuntimeException("Access denied");
//        }
//        return proceedingJoinPoint.proceed();
//    }

    @After("execution(java.util.List *(..))")
    public void getReturn1 () {
        System.out.println("[LOG] get method with List in return");
    }
}
