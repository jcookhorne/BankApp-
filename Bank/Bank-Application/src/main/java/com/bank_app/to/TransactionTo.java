package com.bank_app.to;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionTo {
	private int transactionId;
	private int fromAccountId;
	private int toAccountId;
	private int transferAmount;
	private Date date;
}
