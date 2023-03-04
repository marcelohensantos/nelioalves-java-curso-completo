package com.udemy.course.javacursocompleto.section8.application;

import com.udemy.course.javacursocompleto.section8.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class TriangleApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("enter the measures of triangle x: ");
        x.a = in.nextDouble();
        x.b = in.nextDouble();
        x.c = in.nextDouble();

        System.out.println("enter the measures of triangle y: ");
        y.a = in.nextDouble();
        y.b = in.nextDouble();
        y.c = in.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.c + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("triangle x area: %.4f\n", areaX);
        System.out.printf("triangle y area: %.4f\n", areaY);

        if (areaX > areaY) {
            System.out.println("larger area: x");
        } else {
            System.out.println("larger area: y");
        }
    }
}
