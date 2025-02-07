package com.bank.model;

import com.bank.builder.BankAccountBuilder;

public class BankAccount {
	private final String accountNumber;
	private final String holderName;
	private final String email;
	private final String phoneNumber;
	private final double balance;

	public BankAccount(BankAccountBuilder builder) {
		this.accountNumber = builder.getAccountNumber();
		this.holderName = builder.getHolderName();
		this.email = builder.getEmail();
		this.phoneNumber = builder.getPhoneNumber();
		this.balance = builder.getBalance();
	}

	public void showAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Holder Name: " + holderName);
		System.out.println("Email: " + (email != null ? email : "Not Provided"));
		System.out.println("Phone Number: " + (phoneNumber != null ? phoneNumber : "Not Provided"));
		System.out.println("Balance: $" + balance);
		System.out.println("-----------------------------------");
	}

	// Builder class for flexible object creation
	public static class Builder extends BankAccountBuilder {
		public Builder(String accountNumber, String holderName) {
			super(accountNumber, holderName);
		}

		@Override
		public BankAccount build() {
			return new BankAccount(this); // No more visibility issue
		}
	}
}
