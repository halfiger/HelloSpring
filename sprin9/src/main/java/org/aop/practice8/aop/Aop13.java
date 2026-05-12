package org.aop.practice8.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop13 {
//    @Before("execution(* *(String)) && args(name)")
//    public void argAop (String name) {
//        System.out.println("Arg: name=" + name);
//    }
}
