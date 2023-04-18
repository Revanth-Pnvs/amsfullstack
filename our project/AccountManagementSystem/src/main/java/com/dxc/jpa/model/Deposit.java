package com.dxc.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="deposit")
public class Deposit {
	
	private long fromAccount;
	private long toAccount;
	@Id
	private int pin;
	
	private double amount;
	
	
	public Deposit() {
		
	}


	public Deposit(long fromAccount, long toAccount, int pin, double amount) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.pin = pin;
		this.amount = amount;
	}


	public long getFromAccount() {
		return fromAccount;
	}


	public void setFromAccount(long fromAccount) {
		this.fromAccount = fromAccount;
	}


	public long getToAccount() {
		return toAccount;
	}


	public void setToAccount(long toAccount) {
		this.toAccount = toAccount;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Deposit [fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", pin=" + pin + ", amount="
				+ amount + "]";
	}
	
}
