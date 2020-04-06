package com.bankApp;

public class BankAccount {
    private final String owner;
    private final String accountNumber;
    private double total;

    public BankAccount(String owner, String accountNumber){
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.total = 1000;
    }

    public void withdraw(double amount){
        if(getBalance() >= amount){
            total = total - amount;
            System.out.println("Transaction completed successfully");
        } else {
            System.out.println("This transaction cannot be processed");
        }
    }

    public double getBalance(){
        return total;
    }
}
