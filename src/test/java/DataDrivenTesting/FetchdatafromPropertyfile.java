package DataDrivenTesting;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class FetchdatafromPropertyfile {

	public static void main(String[] args) throws IOException  {
		//Convert physical file into java object
		
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");

		//create a object of properties
		Properties p = new Properties();
		
		//Load the property object
		
		p.load(fis);
		
		//Fetch the data from property file
		
		String data = p.getProperty("url");
		
		String data1 = p.getProperty("browser");
		
		String data2 = p.getProperty("timeouts");
		
		String data3 = p.getProperty("username");
		
		String data4 = p.getProperty("password");
		
		System.out.println(data);
		
		System.out.println(data1);
		
		System.out.println(data2);
		
		System.out.println(data3);
		
		System.out.println(data4);
		
		
		
	}

}
