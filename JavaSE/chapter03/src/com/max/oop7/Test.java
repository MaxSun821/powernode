package com.max.oop7;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("BlackFlag", 3);
        Swallow swallow = new Swallow("FloralSkirt", 1);
        Parrot parrot = new Parrot("Jack", 2);

        dog.display();
        swallow.display();
        parrot.display();

        dog.eat();
        swallow.eat();
        parrot.eat();

        swallow.fly();
        parrot.fly();
        parrot.speak();
    }
}
