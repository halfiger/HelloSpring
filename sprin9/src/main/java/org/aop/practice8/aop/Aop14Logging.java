package org.aop.practice8.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class Aop14Logging {
//    @Before("execution(* *(..))")
//    public void securityAspect() {
//        System.out.println("[LOG] security aspect [first]");
//    }
}
