package model;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private String type;
    private double amount;
    private LocalDateTime date;
    private String sourceAccount;
    private String destinationAccount;

    public Transaction(String transactionId, String type, double amount, 
                String sourceAccount, String destinationAccount){
        this.transactionId = transactionId;
        this.type = type;
        this.date = LocalDateTime.now();
        this.amount = amount;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
    } 

    public String getTransactionId(){return this.transactionId;}
    public String getType(){return this.type;}
    public double getAmount(){return this.amount;}
    public LocalDateTime getDate(){return this.date;}
    public String getSourceAccount(){return this.sourceAccount;}
    public String getDestinationAccount(){return this.destinationAccount;}

}