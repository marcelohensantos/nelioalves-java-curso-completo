package com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities;

import com.udemy.course.javacursocompleto.section14.abstractclasses.model.enums.Color;

public class Circle extends Shape {
    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
