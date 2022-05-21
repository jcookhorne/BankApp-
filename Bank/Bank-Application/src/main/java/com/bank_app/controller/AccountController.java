package com.bank_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank_app.service.AccountService;
import com.bank_app.to.AccountTo;

@RestController// a combination of @Controller and @ResponseBody
@CrossOrigin // get through cors issue that happens
@RequestMapping("api")
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@PostMapping("/login")
	AccountTo login(@RequestBody AccountTo account) {
		return accountService.login(account);
	}
	
	@GetMapping("/account-view/{accountId}")
	AccountTo accountView(@PathVariable("accountId") int aid) {
		return accountService.accountView(aid);
	}
	@PostMapping("/account-add")
	AccountTo addNewAccount(@RequestBody AccountTo account) {
		return accountService.addNewAccount(account);
	}
}
