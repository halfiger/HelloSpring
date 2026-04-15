package org.aop.practice3.task4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
        @Before("execution(* register (..)) && args(username)")
    public void aspectArgument (String username) {
            System.out.println("[LOG] Registering user: " + username);
        }
}
