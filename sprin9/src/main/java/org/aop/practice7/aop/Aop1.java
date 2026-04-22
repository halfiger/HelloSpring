package org.aop.practice7.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop1 {
    @Before("execution(* org.aop.practice7.entity.OrderService.*Check*(..))")
    public void beforeAdvice () {
        System.out.println("[SECURITY] Checking user before checkout");
    }

    @After("execution(* org.aop.practice7.entity.PaymentService.*Pay*(..))")
    public void afterAdvice () {
        System.out.println("[SECURITY] Checking user before checkout");
    }
}
