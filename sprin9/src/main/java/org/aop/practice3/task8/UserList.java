package org.aop.practice3.task8;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
@Component
public class UserList {
    public List<String> myList () {
        List <String> list = new ArrayList<>();
        list.add("ivan");
        list.add("anna");
        return list;
    }
}