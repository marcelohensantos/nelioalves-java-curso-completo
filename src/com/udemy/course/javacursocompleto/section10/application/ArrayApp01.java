package com.udemy.course.javacursocompleto.section10.application;

import java.util.Locale;
import java.util.Scanner;

public class ArrayApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextDouble();
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        System.out.printf("AVERAGE HEIGHT: %.2f\n", (sum / numbers.length));
    }
}
