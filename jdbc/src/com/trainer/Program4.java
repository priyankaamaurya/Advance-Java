package com.trainer;

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
			
			statement.execute("delete from trainer where Tid='101';");
			statement.execute("delete from trainer where Tid='102';");
			statement.execute("delete from trainer where Tid='103';");
			statement.execute("delete from trainer where Tid='104';");
			statement.execute("delete from trainer where Tid='105';");
			statement.execute("delete from trainer where Tid='106';");
			statement.execute("delete from trainer where Tid='107';");
			statement.execute("delete from trainer where Tid='108';");
			statement.execute("delete from trainer where Tid='109';");
			statement.execute("delete from trainer where Tid='110';");
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
