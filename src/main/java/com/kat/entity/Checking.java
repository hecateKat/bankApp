package com.kat.entity;

public class Checking extends Account {

    private int debitCardNo;
    private int debitCardPin;

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accNo = "2" + accNo;
    }

    private void setdebitCardInfo() {
        debitCardNo = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));

    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    public void showInfo () {
            System.out.println("Account type: Checking");
            super.showInfo();
            System.out.println("Checking Account information: " +
                    "\nNumber: " + debitCardNo +
                    "\nPIN: " + debitCardPin);
    }


}

