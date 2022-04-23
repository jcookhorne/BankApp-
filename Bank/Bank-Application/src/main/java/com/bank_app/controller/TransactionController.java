package com.bank_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank_app.service.TransactionService;
import com.bank_app.to.TransactionTo;

@RestController// a combination of @Controller and @ResponseBody
@CrossOrigin // get through cors issue that happens
@RequestMapping("api") // makes every http request start with api
public class TransactionController {

	
	@Autowired
	TransactionService transactionService;
	
	@PutMapping("/transfer")
	TransactionTo transfer(@RequestBody TransactionTo transaction) {
		return transactionService.transfer(transaction);
	}
	
	@GetMapping("/transaction-history")
	List<TransactionTo> transactionHistory(@RequestBody TransactionTo transaction) {
		return transactionService.transactionHistory(transaction);
	}
}
