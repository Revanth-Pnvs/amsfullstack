package com.dxc.jpa.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	private String email;
	private long phone;
	private String gender;
	private String password;
	private String confirmPassword;
	private String address;
	@Id
	private String accountnumber;
	private String ifsc;
	private String bank;
	private String accountType;

	public User() {

	}

	public User(String firstName, String lastName, LocalDate dateOfBirth, String email, long phone, String gender,
			String password, String confirmPassword, String address, String accountnumber, String ifsc, String bank,
			String accountType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.address = address;
		this.accountnumber = accountnumber;
		this.ifsc = ifsc;
		this.bank = bank;
		this.accountType = accountType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", email="
				+ email + ", phone=" + phone + ", gender=" + gender + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", address=" + address + ", accountnumber=" + accountnumber + ", ifsc=" + ifsc
				+ ", bank=" + bank + ", accountType=" + accountType + "]";
	}
	
}
