package com.udemy.course.javacursocompleto.section15.application;

import com.udemy.course.javacursocompleto.section15.exception.DomainException;
import com.udemy.course.javacursocompleto.section15.model.entities.Reservation;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Scanner;

public class ReservationApp01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        LocalDate checkIn = null;
        LocalDate checkOut = null;
        Reservation reservation = null;

        try {
            System.out.print("room number: ");
            int roomNumber = in.nextInt();

            System.out.print("check-in date (dd/mm/yyyy): ");
            checkIn = LocalDate.parse(in.next(), Reservation.dateTimeFormatter);

            System.out.print("check-out date (dd/mm/yyyy): ");
            checkOut = LocalDate.parse(in.next(), Reservation.dateTimeFormatter);

            reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("reservation: " + reservation);

            System.out.println("\nenter date to update reservation:");

            System.out.print("check-in date (dd/mm/yyyy): ");
            checkIn = LocalDate.parse(in.next(), Reservation.dateTimeFormatter);

            System.out.print("check-out date (dd/mm/yyyy): ");
            checkOut = LocalDate.parse(in.next(), Reservation.dateTimeFormatter);

            reservation.updateDates(checkIn, checkOut);
            System.out.println("reservation: " + reservation);
        } catch (DomainException e) {
            System.out.println("error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("unexpected error!");
        }
    }
}
