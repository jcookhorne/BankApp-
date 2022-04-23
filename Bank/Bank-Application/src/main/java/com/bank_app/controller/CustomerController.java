package com.bank_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank_app.service.CustomerService;
import com.bank_app.to.CustomerTo;

@RestController// a combination of @Controller and @ResponseBody
@CrossOrigin // get through cors issue that happens
@RequestMapping("api") // makes every http request start with api
public class CustomerController {

	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customer-info/{customerId}")
	CustomerTo customerInfo(@PathVariable("customerId") int cid) {
		return customerService.customerInfo(cid);
		
	}
	
	
}
