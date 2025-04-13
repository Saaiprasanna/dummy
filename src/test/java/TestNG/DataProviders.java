package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	
	@Test (dataProvider = "data")
	public void demo(String d1,String d2, String d3) {
		
		System.out.println(d1+d2+d3);
	}
	
	
	@DataProvider
	public Object[][] data() {
		
		Object[][] obj = new Object[2][3];
		
		obj[0][1] = "a";
		obj[0][1] = "b";
		obj[0][2] = "c";
		
		obj[1][0] = "d";
		obj[1][1] = "e";
		obj[1][2] = "f";
		return obj;
		
	}
}
