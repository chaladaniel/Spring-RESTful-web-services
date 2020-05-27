package com.bank.service;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import com.bank.model.Transcation;

@Validated
public interface TransctionService {

	List<Transcation> findAll();
	
	Transcation findOne(Long transDate);
	
	Transcation save(Transcation transcation);
	
	void delete(Long transcationDate);
	
}
