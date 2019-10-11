package com.kat;

import com.kat.utilities.CSV;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String file = "C:\\Users\\Kat\\IdeaProjects\\bankApp\\NewBankAccounts.csv";

        CSV csv = new CSV();

        List<String[]> newAccounts = csv.read(file);

        for(String[] newAccount : newAccounts){

            String name = newAccount[0];
            String sSN = newAccount[1];
            String accountType = newAccount[2];
            double initDeposit = Double.parseDouble(newAccount[3]);

            System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
            System.out.println("----------");

            if (accountType.equals("Savings")){
                System.out.println("Open a savings account");
            }else if (accountType.equals("Checking")){
                System.out.println("Open a checking account");
            }else {
                System.out.println("Error - wrong account type");
            }

        }

    }
}
