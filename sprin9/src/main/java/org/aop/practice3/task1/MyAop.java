package org.aop.practice3.task1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {
    @Before("execution(public void check*())")
    public void logging () {
        System.out.println("[SECURITY] Checking user before checkout");
    }
}
