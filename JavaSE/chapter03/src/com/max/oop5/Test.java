package com.max.oop5;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(4, 5);
        Shape s2 = new Square(4, 4);

        System.out.println(s1.getArea());
        System.out.println(s2.getArea());

        Person p1 = new EnglishPerson();
        Person p2 = new ChinesePerson();
        p1.greet();
        p2.greet();
    }
}
