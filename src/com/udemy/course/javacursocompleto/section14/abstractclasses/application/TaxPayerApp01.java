package com.udemy.course.javacursocompleto.section14.abstractclasses.application;

import com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities.Company;
import com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities.Individual;
import com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TaxPayerApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("enter the number of tax payers: ");
        int numOfTaxPayers = in.nextInt();
        for (int i = 0; i < numOfTaxPayers; i++) {
            System.out.printf("tax payer #%d data:\n", (i + 1));

            System.out.print("individual or company (i/c)? ");
            char optTaxPayer = in.next().trim().toLowerCase().charAt(0);

            System.out.print("name: ");
            in.nextLine();
            String name = in.nextLine();

            System.out.print("annual income: ");
            double annualIncome = in.nextDouble();

            if (optTaxPayer == 'i') {
                System.out.print("health expenditures: ");
                double healthExpenditures = in.nextDouble();
                taxPayers.add(new Individual(name, annualIncome, healthExpenditures));
            } else if (optTaxPayer == 'c') {
                System.out.print("number of employees: ");
                int employees = in.nextInt();
                taxPayers.add(new Company(name, annualIncome, employees));
            }
        }

        System.out.println("\ntaxes paid:");
        double totalTaxes = 0;
        for (TaxPayer taxPayer : taxPayers) {
            System.out.printf("%s: $%.2f\n", taxPayer.getName(), taxPayer.tax());
            totalTaxes += taxPayer.tax();
        }
        System.out.printf("\ntotal taxes: $%.2f\n", totalTaxes);
    }
}
