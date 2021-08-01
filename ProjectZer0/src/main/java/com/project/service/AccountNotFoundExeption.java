package com.project.service;



public class AccountNotFoundExeption extends RuntimeException {

	public AccountNotFoundExeption(String accNum) {
		super(accNum);
	}

}