package org.aop.practice8.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop18 {
    @Around("execution(String *(String))")
    public Object aspectUpperCase (ProceedingJoinPoint pjp) throws Throwable {
        String s = (String) pjp.getArgs()[0];
        return s.toUpperCase();
    }
}
