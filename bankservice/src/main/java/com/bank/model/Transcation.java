package com.bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transcation {
	@Id
	@GeneratedValue
	private Long transactionId;
	private String transcationAmount;
	private String transcationType;
	
	public Transcation() {		
	}

	public Transcation(Long transactionId, String transcationAmount, String transcationType) {
		super();
		this.transactionId = transactionId;
		this.transcationAmount = transcationAmount;
		this.transcationType = transcationType;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getTranscationAmount() {
		return transcationAmount;
	}

	public void setTranscationAmount(String transcationAmount) {
		this.transcationAmount = transcationAmount;
	}

	public String getTranscationType() {
		return transcationType;
	}

	public void setTranscationType(String transcationType) {
		this.transcationType = transcationType;
	}	
	
}
