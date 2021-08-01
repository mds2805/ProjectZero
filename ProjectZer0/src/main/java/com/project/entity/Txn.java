package com.project.entity;
import java.time.LocalDateTime;

public class Txn {

	private int transaction_id;
	private double amount;
	private LocalDateTime dateTime;
	private TxnType type;
	private Account account;

	public Txn(double amount, LocalDateTime dateTime, TxnType type) {
		super();
		this.amount = amount;
		this.dateTime = dateTime;
		this.type = type;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	
	public double getAmount() {
		return amount;
	}

	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public TxnType getType() {
		return type;
	}

	public void setType(TxnType type) {
		this.type = type;
	}

}
