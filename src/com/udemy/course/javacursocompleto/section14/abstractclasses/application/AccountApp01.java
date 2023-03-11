package com.udemy.course.javacursocompleto.section14.abstractclasses.application;


import com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities.Account;
import com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities.BusinessAccount;
import com.udemy.course.javacursocompleto.section14.abstractclasses.model.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AccountApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount(1001, "alex", 500.0, 0.01));
        accounts.add(new BusinessAccount(1002, "maria", 1000.0, 400.0));
        accounts.add(new SavingsAccount(1003, "bob", 300.0, 0.01));
        accounts.add(new BusinessAccount(1004, "anna", 500.0, 500.0));

        double sum = 0.0;
        for (Account account : accounts) {
            sum += account.getBalance();
        }
        System.out.printf("total balance: %.2f\n", sum);

        for (Account account : accounts) {
            account.deposit(10.0);
        }

        for (Account account : accounts) {
            System.out.printf("updated balance for account %d: %.2f\n", account.getNumber(), account.getBalance());
        }


    }
}
