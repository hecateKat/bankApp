package com.kat;

import com.kat.utilities.CSV;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String file = "C:\\Users\\Kat\\IdeaProjects\\bankApp\\NewBankAccounts.csv";

        CSV csv = new CSV();

        List<String[]> newAccounts = csv.read(file);

        for(String[] newAccount : newAccounts){
            System.out.println("New account created");

            System.out.println(newAccount[0]);
            System.out.println(newAccount[1]);
            System.out.println(newAccount[2]);
            System.out.println(newAccount[3]);
            System.out.println("----------");

        }

    }
}
