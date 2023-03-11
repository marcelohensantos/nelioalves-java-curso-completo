package com.udemy.course.javacursocompleto.section14.abstractclasses.application;

import com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities.Circle;
import com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities.Rectangle;
import com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities.Shape;
import com.udemy.course.javacursocompleto.section14.abstractclasses.model.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ShapeApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("enter the number of shapes: ");
        int numShapes = in.nextInt();

        for (int i = 0; i < numShapes; i++) {
            System.out.printf("shape #%d data:\n", (i + 1));

            System.out.print("rectangle or circle (r/c)? ");
            char optShape = in.next().trim().toLowerCase().charAt(0);

            in.nextLine();
            System.out.print("color (black/blue/red)? ");
            Color colorShape = Color.valueOf(in.next().trim().toUpperCase());

            if (optShape == 'r') {
                System.out.print("width: ");
                double width = in.nextDouble();
                System.out.print("height: ");
                double height = in.nextDouble();
                shapes.add(new Rectangle(colorShape, width, height));
            } else if (optShape == 'c') {
                System.out.print("radius: ");
                double radius = in.nextDouble();
                shapes.add(new Circle(colorShape, radius));
            }
        }

        System.out.println("\nshape areas");
        for (Shape shape : shapes) {
            System.out.printf("%.2f\n", shape.area());
        }
    }
}
