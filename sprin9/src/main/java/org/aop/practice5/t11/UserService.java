package org.aop.practice5.t11;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void delete () {
        System.out.println("delete data");
    }

    public void create () {
        System.out.println("create data");
    }
}
