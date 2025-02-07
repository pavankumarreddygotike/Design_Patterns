package com.bank.main;


import com.bank.model.BankAccount;

public class Main {
    public static void main(String[] args) {
        // Creating an account with only required details
        BankAccount account1 = new BankAccount.Builder("123456789", "John Doe")
                .build();

        // Creating an account with additional details
        BankAccount account2 = new BankAccount.Builder("987654321", "Alice Smith")
                .setEmail("alice@example.com")
                .setPhoneNumber("123-456-7890")
                .setBalance(5000.00)
                .build();

        // Creating another account with different details
        BankAccount account3 = new BankAccount.Builder("555666777", "Bob Brown")
                .setPhoneNumber("999-888-7777")
                .setBalance(1500.75)
                .build();

        // Displaying account details
        account1.showAccountDetails();
        account2.showAccountDetails();
        account3.showAccountDetails();
    }
}
