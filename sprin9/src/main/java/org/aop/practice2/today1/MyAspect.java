package org.aop.practice2.today1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Before("execution(public void check* ())")
    public void aspectBefore () {
        System.out.println("[SECURITY] Checking user before checkout");
    }
}
