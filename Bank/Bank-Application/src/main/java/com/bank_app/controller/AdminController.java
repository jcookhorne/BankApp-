package com.bank_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank_app.service.AdminService;
import com.bank_app.to.AdminTo;

@RestController// a combination of @Controller and @ResponseBody
@CrossOrigin // get through cors issue that happens
@RequestMapping("api") // makes every http request start with api
public class AdminController {
	
	@Autowired // this handles dependency injections so we can refrences the methods
	// within the class or interface refrenced below or access the objects within them.
	AdminService adminService;
	
	@GetMapping
	AdminTo adminInfo(@PathVariable("adminId") int aid) {
		return adminService.adminInfo(aid);
	}

}
