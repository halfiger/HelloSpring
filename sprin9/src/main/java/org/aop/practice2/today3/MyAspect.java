package org.aop.practice2.today3;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class MyAspect {

    @Around("execution(public void *Report ())")
    public Object generateAroundAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Start");
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("End");
        return targetMethodResult;
    }
}
