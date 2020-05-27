package com.bank.service;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import com.bank.model.Account;

@Validated
public interface AccountService {
	
	Account findOne(Long holderId);
	
	List<Account> findAll();
	
	Account save(Account info);
	
	void deleteOne(Long holderId);
	
	List<Account> findByHolderId(Long id);
}
