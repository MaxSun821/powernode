package com.max.oop6;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle("circle", "blue", 3);
        Shape s2 = new Rectangle("rectangle", "yellow", 4, 5);

        s1.display();
        s2.display();

        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
