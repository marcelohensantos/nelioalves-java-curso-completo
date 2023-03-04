package com.udemy.course.javacursocompleto.section13.composition.application;

import com.udemy.course.javacursocompleto.section13.composition.model.entities.Department;
import com.udemy.course.javacursocompleto.section13.composition.model.entities.HourContract;
import com.udemy.course.javacursocompleto.section13.composition.model.entities.Worker;
import com.udemy.course.javacursocompleto.section13.composition.model.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class WorkerApp01 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fmt2 = new SimpleDateFormat("MM/yyyy");
        Scanner in = new Scanner(System.in);

        System.out.print("enter department's name: ");
        Department department = new Department(in.nextLine());

        System.out.println("enter worker data: ");
        System.out.print("name: ");
        String workerName = in.nextLine();

        System.out.print("level: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(in.next());

        System.out.print("base salary: ");
        Double workerBaseSalary = in.nextDouble();

        Worker worker = new Worker(workerName, workerLevel, workerBaseSalary, department);

        System.out.print("How many contracts to this worker? ");
        int numContracts = in.nextInt();
        for (int i = 0; i < numContracts; i++) {
            System.out.printf("\nenter contract #%d data: \n", i + 1);

            System.out.print("date (dd/mm/yyyy): ");
            in.nextLine();
            Date date = fmt1.parse(in.next());

            System.out.print("value per hour: ");
            double value = in.nextDouble();

            System.out.print("duration (hours): ");
            int hours = in.nextInt();

            worker.addContract(new HourContract(date, value, hours));
        }

        System.out.print("\nenter month and year to calculate income (mm/yyyy): ");
        in.nextLine();
        Date date = fmt2.parse(in.nextLine());
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        System.out.print("name: " + worker.getName());
        System.out.print("\ndepartment: " + worker.getDepartment().getName());
        System.out.printf("\nincome for mm/yyyy: %.2f\n", worker.income(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)));
    }
}
