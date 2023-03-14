package com.udemy.course.javacursocompleto.section15.application;

import com.udemy.course.javacursocompleto.section15.exception.BusinessException;
import com.udemy.course.javacursocompleto.section15.model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class AccountApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter account data:");

            System.out.print("number: ");
            int number = in.nextInt();

            System.out.print("holder: ");
            in.nextLine();
            String holder = in.nextLine();

            System.out.print("initial balance: ");
            double balance = in.nextDouble();

            System.out.print("withdraw limit: ");
            double withdrawLimit = in.nextDouble();

            System.out.print("\nenter amount for withdraw: ");
            double amount = in.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);
            account.withdraw(amount);
            System.out.println("new balance: " + account.getBalance());
        } catch (BusinessException e) {
            System.out.println("withdraw error: " + e.getMessage());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
