package com.fruits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program4 {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url=("jdbc:postgresql://localhost:5432/first");
			String user="postgres";
			String password="root";
			
			Connection connection =DriverManager.getConnection(url,user,password);
			System.out.println(connection);
			
			Statement statement=connection.createStatement();
			
			statement.execute("delete from fruits where Sno='1';");
			statement.execute("delete from fruits where Sno='2';");
			statement.execute("delete from fruits where Sno='3';");
			statement.execute("delete from fruits where Sno='4';");
			statement.execute("delete from fruits where Sno='5';");
			statement.execute("delete from fruits where Sno='6';");
			statement.execute("delete from fruits where Sno='7';");
			statement.execute("delete from fruits where Sno='8';");
			statement.execute("delete from fruits where Sno='9';");
			statement.execute("delete from fruits where Sno='10';");
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}


