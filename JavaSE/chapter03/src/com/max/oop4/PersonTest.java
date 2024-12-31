package com.max.oop4;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(Person.getPersonCounter());
        Person p2 = new Person();
        System.out.println(Person.getPersonCounter());
        Person p3 = new Person("张三", 20, true);
        System.out.println(Person.getPersonCounter());
    }
}
