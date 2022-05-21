package com.bank_app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank_app.dao.CustomerDao;
import com.bank_app.entity.CustomerEntity;
import com.bank_app.to.CustomerTo;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao customerDao;


	@Override
	public CustomerTo customerInfo(int customerId) {
		Optional<CustomerEntity> optional = customerDao.findById(customerId);
		CustomerTo cust = null;
		if(optional.isPresent()) {
			CustomerEntity customer = optional.get();
			 cust = new CustomerTo(customer.getCustomerId(), customer.getCustomerFirstName(),
					customer.getCustomerLastName(), customer.getCustomerAddress(),
					customer.getCustomerEmail(), customer.getCustomerMobileNumber());
		}
		return cust;
	}


	@Override
	public CustomerTo createCustomer(CustomerTo customer) {
		// TODO Auto-generated method stub
		CustomerEntity customerEntity = new CustomerEntity(
				customer.getCustomerId(), customer.getCustomerAddress(), customer.getCustomerEmail(),
				customer.getCustomerFirstName(), customer.getCustomerLastName(), customer.getCustomerMobileNumber());
		customerDao.save(customerEntity);
		return customer;
	}

}
