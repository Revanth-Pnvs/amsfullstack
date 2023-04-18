package com.dxc.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="withdraw")
public class Withdraw {
	
	private long accountNumber;
	private double amount;
	@Id
	private int pin;
	
	public Withdraw() {
		
	}

	public Withdraw(long accountNumber, double amount, int pin) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.pin = pin;
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

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Withdraw [accountNumber=" + accountNumber + ", amount=" + amount + ", pin=" + pin + "]";
	}
	
}
