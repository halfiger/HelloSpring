package org.aop.practice8.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop17 {
//    @Before("execution(* *(..))")
//    public void ageAspect (JoinPoint jp) throws Throwable {
//        int age = (int) jp.getArgs()[1];
//        if (age > 18) {
//            System.out.println("[LOG] age more than 18");
//        }
//    }
}
