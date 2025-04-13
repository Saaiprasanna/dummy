package Training1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
  
	
	public static void main(String[] args) throws InterruptedException {
		  
		
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		// navigate to URL
		driver.get("https://www.instagram.com/");
		
		//it will maximize page
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//  click on sign up
		driver.findElement(By.xpath("//span[@class='_ap3a _aaco _aacw _aad0 _aad7']")).click();
		Thread.sleep(3000);
		 
		//enter the mobile no.
		driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys("9908768904");
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[aria-label='Full Name']")).sendKeys("Sathwika.Sath");
	    	
		Thread.sleep(5000);
		
	     
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
