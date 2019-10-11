package com.kat.entity;

import com.kat.Interface.BaseRate;

public abstract class Account implements BaseRate {

     String name;
     String sSN;
     double balance;

     static int index = 1000;
     String accNo;
     double rate;

    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        this.accNo = setAccNo();
        System.out.println("ACC NO: " + this.accNo);

    }

    private String setAccNo (){
        String last2SSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueId = index;
        int randNo = (int) (Math.random() * Math.pow(10, 3));
        return last2SSN + uniqueId + randNo;
    }

    public void showInfo() {
        System.out.println("Name: " + name +
                "\nAccount NO: " + accNo +
                "\nBallance: " + balance);
    }


}
