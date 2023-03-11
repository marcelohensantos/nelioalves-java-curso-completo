package com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities;

public class Company extends TaxPayer {
    private int numOfEmployees;

    public Company(String name, Double annualIncome, int numOfEmployees) {
        super(name, annualIncome);
        this.numOfEmployees = numOfEmployees;
    }

    @Override
    public Double tax() {
        if (numOfEmployees > 10) {
            return annualIncome * 0.14;
        } else {
            return annualIncome * 0.16;
        }
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }
}
