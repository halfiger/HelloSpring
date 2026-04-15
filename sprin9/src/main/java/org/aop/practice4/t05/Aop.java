package org.aop.practice4.t05;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @Before("execution(* org.aop.practice4.t05.p2..*(String))")
    public void logging () {
        System.out.println("log for package");
    }
}
