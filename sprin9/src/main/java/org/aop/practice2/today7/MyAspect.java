package org.aop.practice2.today7;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
public class MyAspect {
    @Before("execution(* org.practice2.today7.repository..*(..))")
    public void myRepositoryPoincut() {
        System.out.println("poincat to repository folder " + LocalDateTime.now());
    }

    @Before("execution(* org.practice2.today7.service..*(..))")
    public void myServicePointCut() {
        System.out.println("poincut to service folder " + LocalDateTime.now());
    }
}
