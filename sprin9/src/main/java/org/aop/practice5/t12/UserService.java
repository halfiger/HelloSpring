package org.aop.practice5.t12;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void get() {
        System.out.println("get method");
    }

    public void set() {
        System.out.println("set method");
    }

    public void delete () {
        System.out.println("delete method");
    }
}
