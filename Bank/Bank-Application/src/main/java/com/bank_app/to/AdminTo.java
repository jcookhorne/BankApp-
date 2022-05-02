package com.bank_app.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminTo {
	private int adminId;
	private String adminFirstName;
	private String adminLastName;
	private String adminMobileNumber;
	private String adminUsername;
	private String adminPassword;
}
