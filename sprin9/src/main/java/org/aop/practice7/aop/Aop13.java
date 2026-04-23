package org.aop.practice7.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop13 {
    @Before("execution(* *(String)) && args(username)")
    public void updateAdvice (String username) {
        System.out.println("[LOG] new username = " + username);
    }
}
