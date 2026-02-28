//package comm;
//
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.Properties;
//
//public class UserProp {
//
//	public static void main(String[] args) {
//		
//		try {
//			
//			FileInputStream f=new FileInputStream("app.properties");
//			
//			Properties p=new Properties();
//			p.load(f);
//			
//			Class.forName(p.getProperty("driver"));
//			String url=p.getProperty("url");
//			String user=p.getProperty("user");
//			String password=p.getProperty("password");
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//}


//
//try {
//	
//	Class.forName("org.postgresql.Driver");
//	
//	String url=("jdbc:postgresql://localhost:5432/first");
//	String user="postgres";
//	String password="root";
//	
//	Connection connection =DriverManager.getConnection(url,user,password);
//	System.out.println(connection);
//	
//	PreparedStatement statement=connection.prepareStatement("insert into first values(?,?);");
//	int x=15;
//	
//	for(int i=0;i<5;i++) {
//		statement.setInt(1, x++);
//		statement.setString(2, "d");
//		statement.executeUpdate();
//		
//	}
//	
//	connection.close();
//	
//} catch (ClassNotFoundException e) {
//e.printStackTrace();
//	
//} catch (SQLException e) {
//	e.printStackTrace();
//}

