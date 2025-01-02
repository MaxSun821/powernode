package com.max.oop7;

public class Parrot extends Animal implements Flyabel, Speakable{
    public Parrot() {
    }

    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating seeds");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void speak() {
        System.out.println("Parrot is talking 'f' words");
    }
}
