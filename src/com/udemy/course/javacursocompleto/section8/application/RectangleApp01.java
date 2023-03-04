package com.udemy.course.javacursocompleto.section8.application;

import com.udemy.course.javacursocompleto.section8.entities.NewRectangle;

import java.util.Locale;
import java.util.Scanner;

public class RectangleApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        NewRectangle newRectangle = new NewRectangle();
        System.out.println("enter rectangle width and height: ");
        newRectangle.width = in.nextDouble();
        newRectangle.height = in.nextDouble();

        System.out.printf("area: %.2f\n", newRectangle.area());
        System.out.printf("perimeter: %.2f\n", newRectangle.perimeter());
        System.out.printf("diagonal: %.2f\n", newRectangle.diagonal());
    }
}
