package com.bank.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountNumber; //pk
	private Long holderId;
	private int balance;
	private double interestRate;
	
	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Transcation> transcation;
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType; // Account-1) checking 2)saving
	
	public Account() {	
	}

	public Account(Long holderId, int accountNumber, int balance, double interestRate, List<Transcation> transcation) {
		super();
		this.holderId = holderId;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		this.transcation = transcation;
	}

	public Long getHolderId() {
		return holderId;
	}

	public void setHolderId(Long holderId) {
		this.holderId = holderId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public List<Transcation> getTranscation() {
		return transcation;
	}

	public void setTranscation(List<Transcation> transcation) {
		this.transcation = transcation;
	}

	public AccountType getAccountTypes() {
		return accountType;
	}

	public void setAccountTypes(AccountType accountType) {
		this.accountType = accountType;
	}
	
}
