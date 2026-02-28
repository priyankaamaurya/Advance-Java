package comm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Prop {

	public static void main(String[] args) {
		
		try {
			FileInputStream f=new FileInputStream("src/app.properties");
			
			Properties p=new Properties();
			p.load(f);
			System.out.println(p);
			String url=p.getProperty("url");
			System.out.println(url);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
