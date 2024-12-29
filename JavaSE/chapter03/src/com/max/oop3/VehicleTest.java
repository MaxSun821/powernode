package com.max.oop3;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Porsche 911", 120, 23, 12, 1.6);
        System.out.println(car.getBrand());
        System.out.println(car.getSpeed());
        System.out.println(car.getLength());
        System.out.println(car.getWidth());
        System.out.println(car.getHeight());

        car.move();
        car.speedUp();
        System.out.println(car.getSpeed());
        car.speedDown();
        System.out.println(car.getSpeed());
    }
}
