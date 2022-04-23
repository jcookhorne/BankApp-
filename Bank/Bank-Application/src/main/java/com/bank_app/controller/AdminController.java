package com.bank_app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// a combination of @Controller and @ResponseBody
@CrossOrigin // get through cors issue that happens
@RequestMapping("api") // makes every http request start with api
public class AdminController {
	
	

}
