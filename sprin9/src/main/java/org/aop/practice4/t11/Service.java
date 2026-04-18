package org.aop.practice4.t11;

import org.springframework.stereotype.Component;

@Component
public class Service {
    public void delete() {
        System.out.println("delete");
    }

    public void create() {
        System.out.println("create");
    }
}
