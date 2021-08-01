package com.project.repository;

import java.sql.SQLException;


import com.project.entity.Account;


public interface TxnRepository {

	
	void save(double amount, Account account,  String  txntype)throws SQLException;

	
}