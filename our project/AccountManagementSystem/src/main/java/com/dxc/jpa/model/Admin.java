package com.dxc.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")

public class Admin {
	
	private String userName;
	@Id
	private String email;
	private long phone;
	private String password;
	
	public Admin() {
		
	}

	public Admin(String userName, String email, long phone, String password) {
		super();
		this.userName = userName;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [userName=" + userName + ", email=" + email + ", phone=" + phone + ", password=" + password + "]";
	}
	
}
