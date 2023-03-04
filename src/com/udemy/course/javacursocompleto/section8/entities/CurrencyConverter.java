package com.udemy.course.javacursocompleto.section8.entities;

public class CurrencyConverter {
    private static final double IOF_TAX = 6.0;

    public static double converter(double currency, double amount) {
        currency *= (1 + (IOF_TAX / 100.0));
        return amount * currency;
    }
}
