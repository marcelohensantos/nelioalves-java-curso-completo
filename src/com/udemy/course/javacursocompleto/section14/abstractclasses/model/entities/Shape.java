package com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities;

import com.udemy.course.javacursocompleto.section14.abstractclasses.model.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract Double area();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
