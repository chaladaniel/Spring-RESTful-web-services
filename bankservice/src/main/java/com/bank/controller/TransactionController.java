package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Transcation;
import com.bank.service.TransctionService;

@RestController
@RequestMapping("/transcation")
public class TransactionController {
	
	@Autowired
	TransctionService transactionService;
	
	@PostMapping()
	public Transcation post(@RequestBody Transcation transcation) {
	return transactionService.save(transcation);	
	}
	
	@GetMapping()
	public List<Transcation> findAll() {
	return (List<Transcation>)transactionService.findAll();
	}
	
	@GetMapping("/{id}")
	public Transcation getAccountTypeById(@PathVariable Long id) {
		return transactionService.findOne(id);
	}
	
	
	@PutMapping("/{id}")
	public Transcation put(@RequestBody Transcation transcation, @PathVariable("id") Long id) {
	return transactionService.save(transcation);	
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		transactionService.delete(id);
	}

}