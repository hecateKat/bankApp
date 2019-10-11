package com.kat.entity;

public class Savings extends Account {

    private int safetyDepoBoxId;
    private int safetyDepoBoxKey;


    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accNo = "1" + accNo;
        setSafetyDepoBox();

    }

    private void setSafetyDepoBox(){
        safetyDepoBoxId = (int) (Math.random() * Math.pow(10, 3));
        safetyDepoBoxKey = (int) (Math.random() * Math.pow(10, 4));

    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .25;
    }

    public void showInfo () {
        System.out.println("Account type: Savings");
        super.showInfo();
        System.out.println("Saving Account information: " +
                "\nID: " + safetyDepoBoxId +
                "\nKey: " + safetyDepoBoxKey);
    }
}
