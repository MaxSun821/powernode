package com.max.oop5;

public class Rectangle extends Shape{
    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getArea() {
        return super.getLength() * super.getWidth();
    }
}
