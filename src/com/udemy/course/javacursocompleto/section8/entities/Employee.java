package com.udemy.course.javacursocompleto.section8.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary *= 1 + (percentage / 100.0);
    }

    @Override
    public String toString() {
        return String.format("%s, $ %.2f", name, netSalary());
    }
}
