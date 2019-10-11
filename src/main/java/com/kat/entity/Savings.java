package com.kat.entity;

public class Savings extends Account {

    private int safetyDepoBoxId;
    private int safetyDepoBoxKey;


    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accNo = "1" + accNo;

    }

    public void showInfo () {
        super.showInfo();
        System.out.println("Account type: Savings");
    }
}
