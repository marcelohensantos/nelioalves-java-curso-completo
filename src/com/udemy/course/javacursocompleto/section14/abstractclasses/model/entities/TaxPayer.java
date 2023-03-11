package com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities;

public abstract class TaxPayer {
    protected String name;
    protected Double annualIncome;

    public TaxPayer(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public abstract Double tax();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }
}
