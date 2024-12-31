package com.max.oop4;

public class Person {
    private String name;
    private int age;
    private boolean gender;
    private static int personCounter;

    public Person() {
        personCounter++;
    }

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        personCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public static int getPersonCounter() {
        return personCounter;
    }
}
