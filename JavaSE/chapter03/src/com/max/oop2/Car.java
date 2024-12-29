package com.max.oop2;

/**
 * ClassName: Car
 * Package: com.max.oop2
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/12/29 13:28
 * @Version 1.0
 */
public class Car {
    private String brand;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 20 || price > 50) {
            System.out.println("That's a wrong price");
            return;
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
