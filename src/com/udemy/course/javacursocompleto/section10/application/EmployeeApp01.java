package com.udemy.course.javacursocompleto.section10.application;

import com.udemy.course.javacursocompleto.section10.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeApp01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("how many employees will be registered? ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nemployee #%d:\n", i + 1);

            System.out.print("id: ");
            int id = in.nextInt();
            in.nextLine();

            System.out.print("name: ");
            String name = in.nextLine();

            System.out.print("salary: ");
            double salary = in.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
        }

        System.out.print("\nenter the employee id that will have salary increase: ");
        int id = in.nextInt();
        Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("this id does not exist!");
        } else {
            System.out.print("enter the percentage: ");
            emp.increaseSalary(in.nextDouble());
        }

        System.out.println("\nlist of employees");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
