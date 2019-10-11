package com.kat.entity;

import com.kat.Interface.BaseRate;

public abstract class Account implements BaseRate {

    private String name;
    private String sSN;
    private double balance;

    private static int index = 1000;
    protected String accNo;
    protected double rate;

    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        this.accNo = setAccNo();
        System.out.println("ACC NO: " + this.accNo);
        getBaseRate();

        setRate();
    }

    public abstract void setRate();

    private String setAccNo() {
        String last2SSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueId = index;
        int randNo = (int) (Math.random() * Math.pow(10, 3));
        return last2SSN + uniqueId + randNo;
    }

    public void compound() {
        double accruedIntr = balance * (rate / 100);
        System.out.println("Accrued interest: $" + accruedIntr);
        printBalance();
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Balance: $" + balance);
    }


    public void showInfo() {
        System.out.println("Name: " + name +
                "\nAccount NO: " + accNo +
                "\nBallance: " + balance +
                "\nRate: " + rate + "%");
    }


}
