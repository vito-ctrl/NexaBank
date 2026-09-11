package model;

import model.Transaction;   
import java.util.HashSet;
import java.util.UUID;

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
            throw new IllegalArgumentException("the initial balance can't bje negative");
        else
            this.balance = balance;
    }

    public String getAccountNumber(){return this.accountNumber;}
    public String getAccountType(){return this.accountType;}
    public double getBalance(){return this.balance;}
    public HashSet<Transaction> getTransactionHistory(){return this.transactionHistory;}

    public void deposit(double amount){
        if(amount <= 0)
            throw new IllegalArgumentException("deposit can't be negative or equal 0");
        this.balance += amount;

        String transactionId = UUID.randomUUID().toString();
        Transaction transaction = new Transaction(transactionId, "Deposit", amount, null, accountNumber);
        this.transactionHistory.add(transaction);
    }

    public void withdraw(double amount){
        if(amount <= 0)
            throw new IllegalArgumentException("deposit can't be negative or equal 0");
        else if(this.balance < amount)
            throw new IllegalArgumentException("can't withdraw more than the balence");
        this.balance -= amount;

        String transactionId = UUID.randomUUID().toString();
        Transaction transaction = new Transaction(transactionId, "Withdraw", amount, accountNumber, null);
        this.transactionHistory.add(transaction);
    }

    public void transfer(double amount, Account destinationAccount){
        if(amount <= 0)
            throw new IllegalArgumentException("deposit can't be negative or equal 0");
        else if(this.balance < amount)
            throw new IllegalArgumentException("can't withdraw more than the balence");
        this.balance -= amount;
        destinationAccount.balance += amount;

        String transactionId = UUID.randomUUID().toString();
        Transaction transaction = new Transaction(transactionId, "transfer", amount, this.accountNumber, destinationAccount.getAccountNumber()); 
        
        this.transactionHistory.add(transaction);
        destinationAccount.transactionHistory.add(transaction);
    }


}