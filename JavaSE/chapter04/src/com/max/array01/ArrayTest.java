package com.max.array01;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] scores = new double[10];
        double sum = 0.0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextDouble();
            sum += scores[i];
        }
        double average = sum / scores.length;
        System.out.println("Average score: " + average);
    }
}
