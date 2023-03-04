package com.udemy.course.javacursocompleto.section13.composition.model.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public double totalValue() {
        return valuePerHour * hours;
    }

    public Date getDate() {
        return date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }
}
