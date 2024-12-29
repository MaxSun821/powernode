package com.max.oop3;

public class NumberTest {
    public static void main(String[] args) {
        Number calculation = new Number(6, 3);
        int addResult = calculation.add();
        int subResult = calculation.sub();
        int mulResult = calculation.mul();
        int divResult = calculation.div();

        System.out.println("add: " + addResult);
        System.out.println("sub: " + subResult);
        System.out.println("mul: " + mulResult);
        System.out.println("div: " + divResult);
    }
}
