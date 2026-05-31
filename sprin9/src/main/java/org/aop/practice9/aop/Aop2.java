package org.aop.practice9.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop2 {
    @After("execution (* process*())")
    public void afterAspect () {
        System.out.println("[LOG] Payment finished");
    }
}
