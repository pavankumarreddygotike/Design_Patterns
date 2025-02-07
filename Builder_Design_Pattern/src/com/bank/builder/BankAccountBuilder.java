package com.bank.builder;


import com.bank.model.BankAccount;

public class BankAccountBuilder {
    protected String accountNumber;
    protected String holderName;
    protected String email;
    protected String phoneNumber;
    protected double balance;

    public BankAccountBuilder(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public BankAccountBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public BankAccountBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public BankAccountBuilder setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    // Getters to access private fields in BankAccount
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount build() {
        return new BankAccount(this);
    }
}

