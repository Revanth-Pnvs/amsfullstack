package com.dxc.mdb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Withdraw {
	
	private long accountNumber;
	private double amount;
	
	public Withdraw() {
		
	}

	public Withdraw(long accountNumber, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Withdraw [accountNumber=" + accountNumber + ", amount=" + amount + "]";
	}
}
