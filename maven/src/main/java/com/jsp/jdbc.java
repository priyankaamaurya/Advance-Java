package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) {
		//task 5 steps 
		try {
			Class.forName("org.postgresql.Driver");
			
			String url="jdbc:postgresql://localhost:5432/first";
			String username="postgres";
			String password="root";
			
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection);
			
			Statement statement = connection.createStatement();
			
			statement.execute("create table Teachers(Tid numeric primary key, name varchar);");
			System.out.println("Table is created");
			
			statement.close();
			connection.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
