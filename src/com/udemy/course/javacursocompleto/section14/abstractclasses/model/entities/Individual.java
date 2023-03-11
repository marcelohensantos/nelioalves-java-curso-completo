package com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (annualIncome < 20000) {
            return annualIncome * 0.15 - healthExpenditures * 0.5;
        } else {
            return annualIncome * 0.25 - healthExpenditures * 0.5;
        }
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
}
