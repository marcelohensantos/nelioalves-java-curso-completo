package com.udemy.course.javacursocompleto.section08.application;

import com.udemy.course.javacursocompleto.section08.entities.CurrencyConverter;

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

        System.out.printf("amount to be paid in reais: %.2f", CurrencyConverter.converter(dollar, amount));
    }
}
