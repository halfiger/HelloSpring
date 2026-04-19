package org.aop.practice5.t12;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @Around("execution(* get()) || execution(* set())")
        public Object logging (ProceedingJoinPoint point) throws Throwable {
        System.out.println("[LOG] method --> " + point.getSignature().getName() + " intercepted");
        return point.proceed();
    }
}
