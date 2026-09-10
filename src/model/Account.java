package model;

import java.util.HashSet;

public class Account{
    private String accountNumber;
    private double balance;
    private String accountType;
    private HashSet<Transaction> transactionHistory;

    public Account(String accountNumber, String accountType, double balance){
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.transactionHistory = new HashSet<>();
        if(balance < 0)
            throw new IllegalArgumentException("the initial balance can't be negative");
        else
            this.balance = balance;
    }

    public String getAccountNumber(){return this.accountNumber;}
    public String getAccountType(){return this.accountType;}
    public double getBalance(){return this.balance;}
    public HashSet<Transaction> getTransactionHistory(){return this.transactionHistory;}

    // public void deposit(double amount){
    //     try{
    //         if(amount < 0)
    //             throw new IllegalArgumentException("deposit can't be negative");
    //         this.balance += amount;
    //     }
    // }
}