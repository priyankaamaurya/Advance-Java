package com.employee;

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
			
			statement.execute("insert into employee values (10001 , 'Gurgaon'), (10002 , 'Noida'), (10003 , 'Sohna'), (10004 , 'Badshahpur'), (10005 , 'Jalgaon'), (10006 , 'Faridabad'), (10007 , 'Delhi'), (10008 , 'Raipur'), (10009 , 'Jaipur'), (10010 , 'Jhasi');");
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
