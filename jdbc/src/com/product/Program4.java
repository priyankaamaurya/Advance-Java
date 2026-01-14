package com.product;

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
			
			statement.execute("delete from product where Pid='1';");
			statement.execute("delete from product where Pid='2';");
			statement.execute("delete from product where Pid='3';");
			statement.execute("delete from product where Pid='4';");
			statement.execute("delete from product where Pid='5';");
			statement.execute("delete from product where Pid='6';");
			statement.execute("delete from product where Pid='7';");
			statement.execute("delete from product where Pid='8';");
			statement.execute("delete from product where Pid='9';");
			statement.execute("delete from product where Pid='10';");
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}


