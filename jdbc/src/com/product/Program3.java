package com.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program3 {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url=("jdbc:postgresql://localhost:5432/first");
			String user="postgres";
			String password="root";
			
			Connection connection =DriverManager.getConnection(url,user,password);
			System.out.println(connection);
			
			Statement statement=connection.createStatement();
			
			statement.execute("update product set name='Procore' where Pid='1';");
			statement.execute("update product set name='PrimeEdge' where Pid='2';");
			statement.execute("update product set name='EliteLine' where Pid='3';");
			statement.execute("update product set name='OptiPro' where Pid='4';");
			statement.execute("update product set name='CoreMax' where Pid='5';");
			statement.execute("update product set name='VertexPro' where Pid='6';");
			statement.execute("update product set name='ExecuLine' where Pid='7';");
			statement.execute("update product set name='LogicPro' where Pid='8';");
			statement.execute("update product set name='TechNova' where Pid='9';");
			statement.execute("update product set name='DataSphere' where Pid='10';");
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}



