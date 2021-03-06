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
@Table(name = "admin_details")
public class AdminEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="admin_id")
	private int adminId;
	
	@Column(name="admin_first_name")
	private String adminFirstName;
	
	@Column(name="admin_last_name")
	private String adminLastName;
	
	@Column(name="admin_mobile_number")
	private String adminMobileNumber;
	
	@Column(name="admin_username")
	private String adminUsername;
	
	@Column(name="admin_password")
	private String adminPassword;
}
