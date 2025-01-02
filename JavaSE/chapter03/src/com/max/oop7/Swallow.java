package com.max.oop7;

public class Swallow extends Animal implements Flyabel{
    public Swallow() {
    }

    public Swallow(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Swallow is eating worms");
    }

    @Override
    public void fly() {
        System.out.println("Swallow is flying");
    }
}
