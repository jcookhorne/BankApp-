package com.bank_app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account_details")
public class AccountEntity  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="account_id")
	private int accountId;
	
	@Column(name="account_name")
	private String accountName;
	
	@Column(name="account_balance")
	private int accountBalance;
	
	@Column(name="account_username")
	private String accountUsername;
	
	@Column(name="account_password")
	private String accountPassword;
	
	// So confused on mapping relations so were just gonna have to try it out
	//@Column(name="account_cust_id")
	@ManyToOne
	@JoinColumn(name = "account_customer_id", referencedColumnName ="customer_Id")
	private CustomerEntity customerId;
	
	// need to add an admin account sections to filter login
	
}
