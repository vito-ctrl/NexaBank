package model;

import model.Person;
import model.Account;
import java.util.HashMap;
import exception.AccountNotFoundException;

public class Client extends Person{
    private String clientId;
    private HashMap<String, Account> account;

    public Client(String firstName, String lastName, String email, String password, String clientId){
        super(firstName, lastName, email, password);
        this.clientId = clientId;
        this.account = new HashMap<>();
    }

    public void displayProfile(){
        System.out.println("name : " + getFirstName() + " clientId : " 
                + clientId + " nb comptes : " + account.size());    
    }

    public Account getAccount(String accountNumber){
        Account acc = account.get(accountNumber);
        if(acc == null){
            throw new AccountNotFoundException("no account fount with acc number : " + accountNumber);
        }
        return acc;
    }
}