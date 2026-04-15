package org.sprin9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
    }

//    public Person() {
//        System.out.println("Person bean is created");
//    }

    public void setSurname(String surname) {
        System.out.println("set surname in Person setter " + surname);
        this.surname = surname;
    }

    public void setAge (int age) {
        System.out.println("set Age in Person setter " + age);
        this.age = age;
    }

    public void setPet (Pet pet) {
        System.out.println("set Pet in Person setter " + pet);
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet() {
        System.out.println("hello my pet");
        pet.say();
    }
}
