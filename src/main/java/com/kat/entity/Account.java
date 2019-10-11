package com.kat.entity;

import com.kat.Interface.BaseRate;

public abstract class Account implements BaseRate {

    private String name;
    private String sSN;
    private double balance;

    private String accNo;
    double rate;

    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
    }
}
