package com.udemy.course.javacursocompleto.section15.application;

import com.udemy.course.javacursocompleto.section15.model.entities.Reservation;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Scanner;

public class ReservationApp01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("room number: ");
        int roomNumber = in.nextInt();

        System.out.print("check-in date (dd/mm/yyyy): ");
        LocalDate checkIn = LocalDate.parse(in.next(), Reservation.dateTimeFormatter);

        System.out.print("check-out date (dd/mm/yyyy): ");
        LocalDate checkOut = LocalDate.parse(in.next(), Reservation.dateTimeFormatter);

        if (checkOut.isBefore(checkIn)) {
            System.out.println("error in reservation: check-out date must be after check-in date");
            return;
        }

        Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
        System.out.println("reservation: " + reservation);

        System.out.println("\nenter date to update reservation:");

        System.out.print("check-in date (dd/mm/yyyy): ");
        checkIn = LocalDate.parse(in.next(), Reservation.dateTimeFormatter);

        System.out.print("check-out date (dd/mm/yyyy): ");
        checkOut = LocalDate.parse(in.next(), Reservation.dateTimeFormatter);

        LocalDate now = LocalDate.now();
        if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
            System.out.println("error in reservation: reservation dates for update must be future dates");
            return;
        }

        if (checkOut.isBefore(checkIn)) {
            System.out.println("error in reservation: check-out date must be after check-in date");
            return;
        }

        reservation.updateDates(checkIn, checkOut);
        System.out.println("reservation: " + reservation);
    }
}
