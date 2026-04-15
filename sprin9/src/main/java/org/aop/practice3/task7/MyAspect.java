package org.aop.practice3.task7;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Before("!execution(* org.aop.practice3.task7.repository..*(..))")
    public void logging () {
        System.out.println("log");
    }
}
