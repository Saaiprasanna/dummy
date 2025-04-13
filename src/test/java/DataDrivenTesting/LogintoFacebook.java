package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoFacebook {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");

		//create a object of properties
		Properties p = new Properties();
		
		//Load the property object
		
		p.load(fis);
		
		//Fetch the data from property file
	
		
		String data = p.getProperty("url");
		
		String time = p.getProperty("timeouts");
		
		long timeouts = Long.parseLong(time);
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeouts));
				
		driver.findElement(By.id("email")).sendKeys("prasanna");
		
		
		driver.findElement(By.id("pass")).sendKeys("prasanna@123");
		
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		
		
		

	}

}
