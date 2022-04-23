package com.bank_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bank_app.to.TransactionTo;

@Service
public interface TransactionService  {

	TransactionTo transfer(TransactionTo transfer);
	
	List<TransactionTo> transactionHistory(TransactionTo transaction);
	
}
