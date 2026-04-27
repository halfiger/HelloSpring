package org.aop.practice7.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop29 {
//    @AfterReturning("execution(* *(..)) && args(username)")
//    public void concreteUsernameAdvice(String username) {
//        if (username.equals("ADMIN")) {
//            System.out.println("[LOG] ADMIN account updated");
//        } else {
//            System.out.println("no logs for method");
//        }
//    }
}