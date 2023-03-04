package com.udemy.course.javacursocompleto.section08.application;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner in = new Scanner(System.in);

        System.out.print("enter radius: ");
        double radius = in.nextDouble();

        System.out.printf("circumference: %.2f\n", com.udemy.course.javacursocompleto.section08.entities.Calculator.circumference(radius));
        System.out.printf("volume: %.2f\n", com.udemy.course.javacursocompleto.section08.entities.Calculator.volume(radius));
        System.out.printf("pi value: %.2f\n", com.udemy.course.javacursocompleto.section08.entities.Calculator.PI);
    }
}
