package com.batch;

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
			
			statement.addBatch("insert into first values (23, 'f');");
			statement.addBatch("insert into first values (20, 'f');");
			statement.addBatch("insert into first values (32, 'f');");
			statement.addBatch("insert into first values (36, 'f');");
			statement.addBatch("insert into first values (48, 'f');");
			statement.addBatch("insert into first values (56, 'f');");
			statement.addBatch("insert into first values (63, 'f');");
			
			statement.executeBatch();
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
