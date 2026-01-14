package com.product;

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
			
			statement.execute("insert into product values (1 , 'DataSphere'), (2 , 'InnovaPro'), (3 , 'TechNova'), (4 , 'SecureX'), (5 , 'CloudMatrix'), (6 , 'LogicPro'), (7 , 'TrustPoint'), (8 , 'EliteLine'), (9 , 'CoreMax'), (10 , 'OptiPro');");
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}


