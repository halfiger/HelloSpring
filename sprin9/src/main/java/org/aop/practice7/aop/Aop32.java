package org.aop.practice7.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class Aop32 {
    private Map<String, String> myCache = new HashMap<>();

    @Around("execution(* *..getUser(String)) && args(id)")
    public Object hashing(ProceedingJoinPoint proceedingJoinPoint, String id) throws Throwable {
        if (myCache.containsKey(id)) {
            return myCache.get(id);
        }

        String result = (String) proceedingJoinPoint.proceed();
        myCache.put(id, result);
        System.out.println(myCache.toString());
        return result;
    }
}

