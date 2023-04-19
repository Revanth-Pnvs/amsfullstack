package com.dxc.mdb.model;

import java.util.List;

public class CheckBalance {
	
	private long accountNumber;

	public CheckBalance() {
		
	}

	public CheckBalance(long accountNumber) {
		
		this.accountNumber = accountNumber;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "CheckBalance [accountNumber=" + accountNumber + "]";
	}

	
	
}
