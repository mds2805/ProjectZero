package com.project.service;

public class AccountBalanceException extends RuntimeException {

	public AccountBalanceException(double balance) {
		super(String.valueOf(balance));
	}

}
