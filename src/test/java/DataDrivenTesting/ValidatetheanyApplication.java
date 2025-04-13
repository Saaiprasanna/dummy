package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidatetheanyApplication {

	@Test
	public void Validate() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.zomato.com");
		
		 WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
		 ele.sendKeys("Biryani");
		 ele.click();
		 
		 driver.findElement(By.xpath("//p[contains(text(),'Biryani - Delivery')]")).click();
		  
		 String e= "Delivery";
		 
		WebElement header = driver.findElement(By.xpath("//h1[contains(text(),'Biryani Delivery in Hyderabad')]"));
		
		if(header.getText().contains(e)) {
			
			System.out.println(e+": TestPass");
		}else {
			System.out.println("testfailed");
		}
		
		}
		

	}

