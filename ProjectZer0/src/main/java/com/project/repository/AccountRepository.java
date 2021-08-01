package com.project.repository;


import com.project.entity.Account;

public interface AccountRepository {
	
	Account load(String accNumber);
	void update(Account account);

}