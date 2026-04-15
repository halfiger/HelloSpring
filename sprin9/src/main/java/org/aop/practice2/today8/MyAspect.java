package org.aop.practice2.today8;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class MyAspect {

    //https://chatgpt.com/g/g-p-696bad5c57fc8191aadb864b1e76c5e5/c/69b98ddc-0060-8333-be50-a9b9c267d295

    @Around("execution(* org.aop.practice3.today8.UserList.myList(..))")
    public Object aroundUsers(ProceedingJoinPoint joinPoint) throws Throwable {
        List<String> result = (List<String>) joinPoint.proceed();
        List<String> modified = result.stream()
                .map(String::toUpperCase)
                .toList();
        return modified;
    }

    @AfterReturning(
            pointcut = "execution(* org.aop.practice3.today8.UserList.myList(..))",
            returning = "result"
    )
    public void afterReturningUsers(List<String> result) {
        System.out.println("Users count: " + result.size());
    }
}
