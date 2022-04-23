package com.bank_app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer_details")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="customer_first_name")
	private String customerFirstName;
	
	@Column(name="customer_last_name")
	private String customerLastName;
	
	@Column(name="customer_address")
	private String customerAddress;
	
	@Column(name="customer_email")
	private String customerEmail;
	
	@Column(name="customer_mobile_number")
	private String customerMobileNumber;
}
