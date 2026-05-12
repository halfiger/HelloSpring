package org.aop.practice8.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class Aop14Security {
//    @Before("execution(* *(..))")
//    public void LoggingAspect () {
//        System.out.println("[LOG] logging aspect [second]");
//    }
}
