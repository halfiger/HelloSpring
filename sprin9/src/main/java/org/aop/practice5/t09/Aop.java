package org.aop.practice5.t09;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @AfterThrowing(pointcut = "execution(* org.aop.practice5.t09.PaymentService.pay*())", throwing = "ex")
    public void loggingThrowing (IllegalStateException ex) {
        System.out.println("LOG Exception " + ex.getMessage());
    }
}
