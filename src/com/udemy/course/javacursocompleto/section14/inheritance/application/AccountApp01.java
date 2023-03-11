package com.udemy.course.javacursocompleto.section14.inheritance.application;

import com.udemy.course.javacursocompleto.section14.inheritance.entities.Account;
import com.udemy.course.javacursocompleto.section14.inheritance.entities.BusinessAccount;
import com.udemy.course.javacursocompleto.section14.inheritance.entities.SavingsAccount;

public class AccountApp01 {
    public static void main(String[] args) {
        Account acc = new Account(1001, "alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "bob", 0.0, 100.0);
        Account acc3 = new SavingsAccount(1003, "bob", 0.0, 0.01);

        // DOWN-CASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            System.out.println("update!");
        }
    }
}
