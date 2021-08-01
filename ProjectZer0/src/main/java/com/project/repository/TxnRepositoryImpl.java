package com.project.repository;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.sql.Connection;
import com.project.database.ConnectionFactory;
import com.project.entity.Account;
import com.project.entity.Txn;

public class TxnRepositoryImpl implements TxnRepository {

	Txn txn;
	
	@Override
	public void save (double amount, Account account,  String  txntype) throws SQLException {

		Connection connection = ConnectionFactory.getConnection();

		 connection = ConnectionFactory.getConnection();
		 Timestamp myDate= Timestamp.valueOf(LocalDateTime.now());

		String sql = "insert into transaction(number,time_stamp,amount,transaction_type) values(?, ?, ?,?)";
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setObject(1,account);
		ps.setTimestamp(2, myDate);
		ps.setDouble(3, amount);
		if (txn.equals("credit"))//ps.setString(3, product.getType().name());
			ps.setString(4,txn.getType().name());
		else
			ps.setString(4,txn.getType().name());

		ps.execute();
		System.out.println("Transaction Updated......");

	}

	



}
