package org.aop.practice3.task8;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class MyAop {

    @Around("execution(* org.aop.practice3.task8.UserList.myList(..))")
    public Object aroundUsers(ProceedingJoinPoint joinPoint) throws Throwable {
        List<String> result = (List<String>) joinPoint.proceed();
        List<String> modified = result.stream()
                .map(String::toUpperCase)
                .toList();
        return modified;
    }

    @AfterReturning(
            pointcut = "execution(* org.aop.practice3.task8.UserList.myList(..))",
            returning = "result"
    )
    public void afterReturningUsers(List<String> result) {
        System.out.println("Users count: " + result.size());
    }
}
