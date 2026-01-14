package com.fruits;

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
			
			statement.execute("insert into fruits values (1 , 'Apple'), (2 , 'Mango'), (3 , 'Banana'), (4 , 'Kiwi'), (5 , 'Pineapple'), (6 , 'Strawberry'), (7 , 'Guava'), (8 , 'Cherry'), (9 , 'Grapes'), (10 , 'Orange');");
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

