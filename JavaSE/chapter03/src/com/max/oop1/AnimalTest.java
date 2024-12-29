package com.max.oop1;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Syndicate";
        animal.birth = "2024/6/19";
        animal.gender = false;
        animal.eat();
        animal.run();
    }
}
