package com.trainer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url=("jdbc:postgresql://localhost:5432/first");
			String user="postgres";
			String password="root";
			
			Connection connection =DriverManager.getConnection(url,user,password);
			System.out.println(connection);
			
			Statement statement=connection.createStatement();
			
			statement.execute("insert into trainer values (101 , 'Ankit'), (102 , 'Ankur'), (103 , 'Vijay'), (104 , 'Vipin'), (105 , 'Abhay'), (106 , 'Vikram'), (107 , 'Dipak'), (108 , 'Sujeet'), (109 , 'Suraj'), (110 , 'Shubham');");
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}