package org.aop.practice7.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
@Order(1)
public class Aop24first {
    @Before("execution(* *())")
    public void lastAdvice() {
        System.out.println("[LOG] first advise working at " + LocalDateTime.now());
    }
}