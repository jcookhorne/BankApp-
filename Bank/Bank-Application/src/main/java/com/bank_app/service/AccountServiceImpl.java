package com.bank_app.service;

import java.util.Optional;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank_app.dao.AccountDao;
import com.bank_app.entity.AccountEntity;
import com.bank_app.to.AccountTo;


@Service
public class AccountServiceImpl implements AccountService {

	
	@Autowired
	AccountDao accountDao;
	
	@Override
	public AccountTo login(AccountTo account) {
		// Find Top changes entire query the number after is the amount that can be set.
		Optional<AccountEntity> optional = accountDao.findFirstByAccountUsernameAndAccountPassword(account.getAccountUsername(), account.getAccountPassword());
		if(optional.isPresent()) {
		AccountEntity accountEntity = optional.get();
		account = new AccountTo(accountEntity.getAccountId(),accountEntity.getAccountName(), accountEntity.getAccountBalance(), accountEntity.getCustomerId(), 
				accountEntity.getAccountUsername(), accountEntity.getAccountPassword());
		
		}
		return account;
	}

	@Override
	public AccountTo accountView(int accountId) {
		Optional<AccountEntity> optional = accountDao.findById(accountId);
		AccountTo account = null;
		if(optional.isPresent()) {
			AccountEntity accountEntity = optional.get();
			account = new AccountTo(accountEntity.getAccountId(),accountEntity.getAccountName(), accountEntity.getAccountBalance(), accountEntity.getCustomerId(), 
					accountEntity.getAccountUsername(), accountEntity.getAccountPassword());
		}
		return account;
	}

	

}
