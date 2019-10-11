package com.kat;

import com.kat.entity.Account;
import com.kat.entity.Checking;
import com.kat.entity.Savings;
import com.kat.utilities.CSV;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<>();

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
                accounts.add(new Savings(name, sSN, initDeposit));
            }else if (accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));
            }else {
                System.out.println("Error - wrong account type");
            }

        }

        for (Account acc : accounts) {
            System.out.println("\n-------------------");
            acc.showInfo();
        }

    }
}
