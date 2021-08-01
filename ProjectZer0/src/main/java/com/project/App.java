package com.project;

import java.util.Scanner;

import com.project.repository.AccountRepository;
import com.project.repository.JdbcAccountRepository;
import com.project.repository.TxnRepository;
import com.project.repository.TxnRepositoryImpl;
import com.project.service.AccountBalanceException;
import com.project.service.TxrService;
import com.project.service.TxrServiceImpl;

public class App {

	public static void main(String[] args) {

		AccountRepository accountRepository = new JdbcAccountRepository();
		TxrService txrService = new TxrServiceImpl(accountRepository);
		TxnRepository txnRepository=new TxnRepositoryImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter from account number");
		String fromAcc = sc.next();

		System.out.println("Enter to account number");
		String toAcc = sc.next();
		System.out.println("Enter amount you want to transfer");
		double amt = sc.nextDouble();
		try {
			txrService.transfer(amt, fromAcc, toAcc);
		} catch (Exception e){
            System.out.println(e.getMessage());
        }

	}

}