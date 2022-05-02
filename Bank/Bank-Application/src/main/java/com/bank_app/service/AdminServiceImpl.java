package com.bank_app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank_app.dao.AdminDao;
import com.bank_app.entity.AdminEntity;
import com.bank_app.to.AdminTo;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;
	
	@Override
	public AdminTo adminInfo(int adminId) {
		Optional<AdminEntity> optional = adminDao.findById(adminId);
		AdminTo adminInfo = null;
		if(optional.isPresent()) {
			AdminEntity admin = optional.get();
			adminInfo = new AdminTo(admin.getAdminId(), admin.getAdminFirstName(),
					admin.getAdminLastName(), admin.getAdminMobileNumber(), admin.getAdminUsername(), admin.getAdminPassword());
		}
		return adminInfo;
	}
	
	

}
