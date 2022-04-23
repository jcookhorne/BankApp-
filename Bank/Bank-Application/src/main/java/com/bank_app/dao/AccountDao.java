package com.bank_app.dao;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank_app.entity.AccountEntity;

@Repository
public interface AccountDao extends JpaRepository<AccountEntity, Integer>{
	
	
	
// you can limit and change the result set with top and setting an integer after which is super cool
	// for this i Just add FIRST and it will only take the first result set that pops up which is all i needed.
	Optional<AccountEntity> findFirstByAccountUsernameAndAccountPassword(String accountUsername, String accountPassword);

	}


