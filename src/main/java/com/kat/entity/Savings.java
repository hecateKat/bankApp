package com.kat.entity;

public class Savings extends Account {

    private int safetyDepoBoxId;
    private int safetyDepoBoxKey;


    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);

    }
}
