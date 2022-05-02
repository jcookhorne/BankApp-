package com.bank_app.service;

import org.springframework.stereotype.Service;

import com.bank_app.to.AdminTo;
@Service
public interface AdminService {
	
	AdminTo adminInfo(int adminId);
	
}
