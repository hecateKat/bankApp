package com.kat.service;

import com.kat.entity.Account;

public class Checking extends Account {

    private int debitCardNo;
    private int debitCardPin;

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);

    }
}

