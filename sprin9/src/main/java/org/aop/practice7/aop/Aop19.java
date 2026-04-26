package org.aop.practice7.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop19 {
//    @AfterThrowing(pointcut = "execution(* *(..))",
//            throwing = "ex")
//    public void adviceAfterThrowing(Exception ex) {
//        System.out.println("[ERROR] Method pay failed");
//    }
}
