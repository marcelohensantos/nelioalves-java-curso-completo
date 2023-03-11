package com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities;

import com.udemy.course.javacursocompleto.section14.abstractclasses.model.enums.Color;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double area() {
        return width * height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
