package org.aop.practice9.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop5 {
    @Before("execution(* org.aop.practice9.services.filtered..*(..))")
    public void packageAspect() {
        System.out.println("[APP LOG] method called");
    }
}
