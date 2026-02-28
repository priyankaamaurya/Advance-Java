package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url=("jdbc:postgresql://localhost:5432/first");
			String user="postgres";
			String password="root";
			
			Connection connection =DriverManager.getConnection(url,user,password);
			System.out.println(connection);
			
			Statement statement=connection.createStatement();
			
			statement.addBatch("insert into Batch values (21, 'f');");
			statement.addBatch("insert into Batch values (5, 'f');");
			statement.addBatch("insert into Batch values (7, 'f');");
			statement.addBatch("insert into Batch values (2, 'f');");
			statement.addBatch("insert into Batch values (9, 'f');");
			statement.addBatch("insert into Batch values (6, 'f');");
			statement.addBatch("insert into Batch values (8, 'f');");
			
			statement.executeBatch();
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
