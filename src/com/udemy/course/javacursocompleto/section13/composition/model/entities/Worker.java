package com.udemy.course.javacursocompleto.section13.composition.model.entities;

import com.udemy.course.javacursocompleto.section13.composition.model.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this(name, level, baseSalary);
        this.department = department;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(Integer year, Integer month) {
        double value = 0;

        for (HourContract contract : contracts) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(contract.getDate());

            if ((cal.get(Calendar.MONTH) == month) && (cal.get(Calendar.YEAR) == year)) {
                value += contract.totalValue();
            }
        }
        return value + baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }
}
