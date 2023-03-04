package com.udemy.course.javacursocompleto.section13.composition.service;

import com.udemy.course.javacursocompleto.section13.composition.model.entities.HourContract;
import com.udemy.course.javacursocompleto.section13.composition.model.entities.Worker;

import java.text.SimpleDateFormat;

public class WorkerReportService {
    public static void generateWorkerReport(Worker worker) {
        System.out.printf("\nname: %s\nlevel: %s\nbase salary: %.2f", worker.getName(), worker.getLevel(), worker.getBaseSalary());

        if (worker.getDepartment() != null) {
            System.out.printf("\ndepartment: %s\n", worker.getDepartment().getName());
        }

        for (HourContract contract : worker.getContracts()) {
            if (contract == null) continue;
            SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            System.out.printf("\n\nhour contract ");
            System.out.printf("\ndate: %s\nvalue per hour: %.2f\nhours: %d\ntotal value: %.2f", fmt.format(contract.getDate()), contract.getValuePerHour(), contract.getHours(), contract.totalValue());
        }
    }
}
