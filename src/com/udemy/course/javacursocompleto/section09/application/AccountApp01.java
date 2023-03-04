package com.udemy.course.javacursocompleto.section09.application;

import com.udemy.course.javacursocompleto.section09.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class AccountApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        Account account = null;

        System.out.print("enter account number: ");
        int id = in.nextInt();

        System.out.print("enter account holder: ");
        in.nextLine();
        String holder = in.nextLine();

        System.out.print("is there an initial deposit (y/n)? ");
        char optDeposit = in.nextLine().charAt(0);

        if (optDeposit == 'y') {
            System.out.print("enter initial deposit value: ");
            account = new Account(id, holder, in.nextDouble());
        } else {
            account = new Account(id, holder);
        }

        System.out.println(account);

        System.out.print("enter a deposit value: ");
        account.deposit(in.nextDouble());

        System.out.println("updated account data:");
        System.out.println(account);

        System.out.print("enter a withdraw value: ");
        account.withdraw(in.nextDouble());

        System.out.println("updated account data:");
        System.out.println(account);
    }
}
