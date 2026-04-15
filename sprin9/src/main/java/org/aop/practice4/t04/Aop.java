package org.aop.practice4.t04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @Before("execution(* *(String)) && args(username)")
    public void logArguments(String username) {
        System.out.println("[LOG] regisered user " + username);
    }
}
