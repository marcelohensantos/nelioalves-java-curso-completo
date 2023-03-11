package com.udemy.course.javacursocompleto.section14.polymorphism.application;

import com.udemy.course.javacursocompleto.section14.polymorphism.entities.Employee;
import com.udemy.course.javacursocompleto.section14.polymorphism.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("enter the number of employees: ");
        int numEmployees = in.nextInt();

        for (int i = 0; i < numEmployees; i++) {
            in.nextLine();

            System.out.printf("employee #%d data:\n", i + 1);
            Employee employee = null;

            System.out.print("outsourced (y/n)? ");
            char outsourced = in.next().trim().toLowerCase().charAt(0);
            in.nextLine();

            System.out.print("name: ");
            String name = in.nextLine();

            System.out.print("hours: ");
            int hours = in.nextInt();

            System.out.print("value per hour: ");
            double valuePerHour = in.nextDouble();

            if (outsourced == 'y') {
                System.out.print("additional charge: ");
                double additionalCharge = in.nextDouble();
                employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
            } else if (outsourced == 'n') {
                employee = new Employee(name, hours, valuePerHour);
            }

            employees.add(employee);
        }

        System.out.println("\npayments: ");
        for (Employee employee : employees) {
            System.out.printf("%s - $%.2f\n", employee.getName(), employee.payment());
        }
    }
}
