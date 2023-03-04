package com.udemy.course.javacursocompleto.section8.application;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        com.udemy.course.javacursocompleto.section8.entities.Employee employee = new com.udemy.course.javacursocompleto.section8.entities.Employee();

        System.out.print("name: ");
        employee.name = sc.nextLine();
        System.out.print("gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("\nemployee: " + employee);

        System.out.print("\nwhich percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());

        System.out.println("\nupdate data: " + employee);
    }
}
