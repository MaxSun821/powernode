package com.max.oop2;

/**
 * ClassName: Employee
 * Package: com.max.oop2
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/12/29 13:34
 * @Version 1.0
 */
public class Employee {
    private String name;
    private int age;
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 800) {
            System.out.println("That's illegal");
            return;
        }
        this.salary = salary;
    }

    public void raise(double money) {
        if ((salary + money) > 10000) {
            System.out.println("You got enough salary");
            return;
        }
        salary += money;
    }
}
