package com.udemy.course.javacursocompleto.section14.polymorphism.entities;

public class ImportedProduct extends Product {
    private Double customFee;

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double totalPrice() {
        return price + customFee;
    }

    @Override
    public String priceTag() {
        return String.format("%s $%.2f (custom fee: $%.2f)", name, totalPrice(), customFee);
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }
}
