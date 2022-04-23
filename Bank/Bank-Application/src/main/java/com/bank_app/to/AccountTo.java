package com.bank_app.to;



import com.bank_app.entity.CustomerEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountTo {

	private int accountId;
	private String accountName;
	private int accountBalance;
	private CustomerEntity customerId; // link to customer id
	private String accountUsername;
	private String accountPassword;
}
