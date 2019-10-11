package com.kat.entity;

import com.kat.entity.Account;

public class Checking extends Account {

    private int debitCardNo;
    private int debitCardPin;

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accNo = "2" + accNo;
    }


    public void showInfo () {
        super.showInfo();
        System.out.println("Account type: Checking");
    }

}

