package org.aop.practice2.today5;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Before("execution(* org.practice2.today5.folder2..*(..))")
    public void getFolderAspect () {
        System.out.println("[APP LOG] method called");
    }
}
