package com.bank_app.service;

import org.springframework.stereotype.Service;

import com.bank_app.to.AccountTo;

@Service
public interface AccountService {
	
	AccountTo  login(AccountTo account);
	
	
	AccountTo accountView(int accountId);
	

}
