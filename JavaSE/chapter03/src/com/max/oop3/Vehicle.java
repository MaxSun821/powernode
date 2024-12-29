package com.max.oop3;

public class Vehicle {
    private String brand;
    private int speed;
    private double length;
    private double width;
    private double height;

    public Vehicle() {}

    public Vehicle(String brand, int speed, double length, double width, double height) {
        this.brand = brand;
        this.speed = speed;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void move() {
        System.out.println("The car is moving by " + speed + " miles per second");
    }

    public void speedUp() {
        if (speed > 220) {
            System.out.println("Your car is too fast");
            return;
        }
        speed += 10;
    }

    public void speedDown() {
        if (speed < 0) {
            System.out.println("Your car is stopped");
            return;
        }
        speed -= 10;
    }
}
