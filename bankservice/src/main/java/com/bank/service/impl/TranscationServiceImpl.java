package com.bank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.exception.ResourceNotFoundException;
import com.bank.model.Transcation;
import com.bank.repository.TranscationalRepository;
import com.bank.service.TransctionService;

@Service
@Transactional
public class TranscationServiceImpl implements TransctionService {
	
	@Autowired
	TranscationalRepository transactionalRepository;
	
	public TranscationServiceImpl(TranscationalRepository transactionalRepository) {
		this.transactionalRepository=transactionalRepository;
	}

	@Override
	public List<Transcation> findAll() {
		return (List<Transcation>) transactionalRepository.findAll();
	}

	@Override
	public Transcation findOne(Long transcationDate) {
		return transactionalRepository.findById(transcationDate).orElseThrow(() -> new ResourceNotFoundException("Transaction not found"));
	}

	@Override
	public Transcation save(Transcation transcation) {
		return transactionalRepository.save(transcation);
	}

	@Override
	public void delete(Long transcationDate) {
		transactionalRepository.deleteById(transcationDate);
		
	}
	
}





