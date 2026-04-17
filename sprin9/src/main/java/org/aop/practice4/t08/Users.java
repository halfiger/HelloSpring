package org.aop.practice4.t08;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Users {
    public List<String> myList () {
        List <String> list = new ArrayList<>();
        list.add("ivan");
        list.add("anna");
        return list;
    }
}
