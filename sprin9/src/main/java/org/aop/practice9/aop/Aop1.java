package org.aop.practice9.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop1 {
    @Before("execution (* *())")
    public void checkUserBefore() {
        System.out.println("[SECURITY] Checking user before checkout");
    }
}
