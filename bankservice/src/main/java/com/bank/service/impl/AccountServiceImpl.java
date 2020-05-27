package com.bank.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.exception.ResourceNotFoundException;
import com.bank.model.Account;
import com.bank.repository.AccountRepository;
import com.bank.service.AccountService;


@Service 
@Transactional
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountRepository accountRepository;

	@Override  
	public Account findOne(Long holderId) {
		return accountRepository.findById(holderId).orElseThrow(() -> new ResourceNotFoundException("Account not found"));
	}
	
	@Override
	public List<Account> findAll() {
		return (List<Account>)accountRepository.findAll();
	}

	@Override
	public Account save(Account info) {
		return accountRepository.save(info);
	}

	@Override
	public void deleteOne(Long holderId) {
		accountRepository.deleteById(holderId);
		
	}

	@Override
	public List<Account> findByHolderId(Long id) {
		return accountRepository.findByHolderId(id);
	}

}
