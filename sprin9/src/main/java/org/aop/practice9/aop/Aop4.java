package org.aop.practice9.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop4 {
//    @Before("execution (* *(String)) && args(name)")
//    public void beforeAspect(String name) {
//        System.out.println("[LOG] Registering user: " + name);
//    }
}
