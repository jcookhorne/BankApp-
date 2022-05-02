package com.bank_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank_app.entity.TransactionEntity;

public interface TransactionDao extends JpaRepository<TransactionEntity, Integer> {

}
