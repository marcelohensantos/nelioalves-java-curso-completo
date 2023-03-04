package com.udemy.course.javacursocompleto.section9.entities;

public class Account {
    static final double WITHDRAW_TAX = 5.0;
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initDeposit) {
        this(number, holder);
        deposit(initDeposit);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + WITHDRAW_TAX;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }
}
