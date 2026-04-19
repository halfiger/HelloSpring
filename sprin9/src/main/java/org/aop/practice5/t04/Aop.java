package org.aop.practice5.t04;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @Before("execution(* register(String)) && args(username)")
    public void userAop (String username) {
        System.out.println("[LOG] Registering user: " + username);
    }
}