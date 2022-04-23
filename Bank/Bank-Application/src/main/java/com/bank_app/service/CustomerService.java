package com.bank_app.service;

import org.springframework.stereotype.Service;

import com.bank_app.to.CustomerTo;

@Service
public interface CustomerService {

	CustomerTo customerInfo(int customerId);
	
	
}
