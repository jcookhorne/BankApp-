package com.bank_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank_app.entity.CustomerEntity;

@Repository
public interface CustomerDao extends JpaRepository<CustomerEntity, Integer>{

}
