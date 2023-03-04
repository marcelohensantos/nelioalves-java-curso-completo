package com.udemy.course.javacursocompleto.section8.entities;

public class Student {
    private final double MIN_GRADE = 60;
    public String name;
    public double[] grades = new double[3];

    public double finalGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public boolean isApproved() {
        return finalGrade() >= MIN_GRADE;
    }

    public double missingPoints() {
        double mp = 0;
        if (!isApproved()) {
            return MIN_GRADE - finalGrade();
        }
        return mp;
    }
}