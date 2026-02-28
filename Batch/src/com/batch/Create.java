package com.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) {
		//jdbc logic
		
		//jdbc 5 steps
		
		//step 1: load driver
		
		try {
			Class.forName("org.postgresql.Driver");
			
			// step:2 create connection server and java
			//location-url
			//username
			//password
			//protocol: //server:port/endpoint
			//jdbc:databasename://localhost:5432/dbname
			
			String url="jdbc:postgresql://localhost:5432/first";
			String user="postgres"; //root
			String password="root";
			
			Connection connection =DriverManager.getConnection(url,user,password);
			System.out.println(connection);
			
			//step:3 creating statement
			Statement statement=connection.createStatement();
			
			//step:4 execute the statement and processResult
			statement.execute("create table Batch (a numeric primary key , b varchar);");
			
			//close connection
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

