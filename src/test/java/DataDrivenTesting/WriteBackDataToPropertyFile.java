package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBackDataToPropertyFile {
	
	
	public static void main(String[] args) throws IOException {
		
		//Convert physical file into java object
		
				FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");

				//create a object of properties
				Properties p = new Properties();
				
				//Load the property object
				
				p.load(fis);
				
				//store the new data 
				p.put("Car","BMW");
				
				//SAVE the property  file
	          FileOutputStream fos = new FileOutputStream("./src/test/resources/CommonData.properties");
				
		p.store(fos, "Updated Successfully");
	}

}
