package org.aop.practice7.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop23 {
    @Before("@annotation(org.aop.practice7.entity.Loggable)")
    public void annotatedAdvice () {
        System.out.println("Getting annotated method");
    }
}
