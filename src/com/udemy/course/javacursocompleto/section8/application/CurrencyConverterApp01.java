package com.udemy.course.javacursocompleto.section8.application;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner in = new Scanner(System.in);

        System.out.print("what is the dollar price? ");
        double dollar = in.nextDouble();
        System.out.print("how many dollars will be bought? ");
        double amount = in.nextDouble();

        System.out.printf("amount to be paid in reais: %.2f", com.udemy.course.javacursocompleto.section8.entities.CurrencyConverter.converter(dollar, amount));
    }
}
