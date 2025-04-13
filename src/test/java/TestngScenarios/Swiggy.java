package TestngScenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Swiggy {
	
	
		@Test (groups="Smoke")
		public void navigateToSwiggy() {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.swiggy.com/restaurants");
		
		Reporter.log("Navigated to Swiggy ",true);
		driver.quit();

		
		}	
		
	

}
