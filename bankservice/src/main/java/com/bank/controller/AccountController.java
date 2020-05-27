package com.bank.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Account;
import com.bank.model.Transcation;
import com.bank.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
		
	@Autowired
	AccountService accountService;
		
	@GetMapping()
	public List<Account> findAll(){
		return accountService.findAll();
	}
	
	@GetMapping("/{id}")
	public Account findById(@PathVariable("id") Long id) {
		return accountService.findOne(id);
	}
	
	@GetMapping("/holder/{id}")
	public List<Account> findByHolderId(@PathVariable Long id) {
		return accountService.findByHolderId(id);
	}
	
	@PostMapping()
	public Account post(@RequestBody Account account){
		return accountService.save(account);
	}
	
	@PutMapping("/{id}")
	public Account put(@RequestBody Account account, @PathVariable("id") Long id){
		return accountService.save(account);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id){
		accountService.deleteOne(id);
	}
	
	private List<Transcation> listOfTranscation = Arrays.asList(new Transcation(2L, "1000", "online"));
	private List<Account> listOfAccount = Collections.singletonList(new Account(1L, 1406, 1000, 0.25, listOfTranscation));
	
	@GetMapping("/Fegn")
	public ResponseEntity<?> getAccountByFegn() {
		return ResponseEntity.ok(listOfAccount);
	}
	
}
