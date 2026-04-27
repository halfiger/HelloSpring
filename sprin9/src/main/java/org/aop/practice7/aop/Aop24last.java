package org.aop.practice7.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Aspect
@Component
@Order(10)
public class Aop24last {
//    @After("execution(* *())")
//    public void lastAdvice () {
//        System.out.println("[LOG] last advise working at " + LocalDateTime.now());
//    }
}
