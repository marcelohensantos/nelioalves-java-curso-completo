package com.udemy.course.javacursocompleto.section8.entities;

public class Calculator {
    public static final double PI = 3.1419;

    public static double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3.0) / 3.0;
    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }
}
