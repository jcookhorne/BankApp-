package com.bank_app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Transaction_details")
public class TransactionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="transaction_id")
	private int transactionId;
	
	@ManyToOne
	@JoinColumn(name="from_account_Id")
	private AccountEntity fromAccountId;
	
	@ManyToOne
	@JoinColumn(name="to_account_id")
	private AccountEntity toAccountId;
	
	@Column(name="transaction_amount")
	private int transferAmount;
	
	@CreationTimestamp
	@Column(name="transaction_date")
	private Date date;
}
