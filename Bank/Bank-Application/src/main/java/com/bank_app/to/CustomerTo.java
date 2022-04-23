package com.bank_app.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerTo {
	private int customerId;
	private String customerFirstName;
	private String customerLastName;
	private String customerAddress;
	private String customerEmail;
	private String customerMobileNumber;
}
