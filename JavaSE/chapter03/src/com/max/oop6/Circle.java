package com.max.oop6;

public class Circle extends Shape{
    private double radius;
    final static double PI = 3.14;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }
}
