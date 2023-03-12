package com.udemy.course.javacursocompleto.section15.model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer duration() {
        return Period.between(checkIn, checkOut).getDays();
    }

    public String updateDates(LocalDate checkIn, LocalDate checkOut) {
        LocalDate now = LocalDate.now();
        if (checkIn.isBefore(now) || checkOut.isBefore(now)) return "reservation dates for update must be future dates";
        if (checkOut.isBefore(checkIn)) return "check-out date must be after check-in date";

        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    @Override
    public String toString() {
        return "room " + roomNumber + ", check-in: " + checkIn.format(dateTimeFormatter) + ", check-out: " + checkOut.format(dateTimeFormatter) + ", " + duration() + " nights";
    }
}
