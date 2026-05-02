package org.aop.practice8.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop4 {
    @Before("execution(* register(String)) && args(username)")
    public void argumentsAccept (String username) {
        System.out.println("[LOG] User registered as " + username);
    }
}
