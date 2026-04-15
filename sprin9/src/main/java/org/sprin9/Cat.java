package org.sprin9;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    @Override
    public void say () {
        System.out.println("Meow meow");
    }
}
