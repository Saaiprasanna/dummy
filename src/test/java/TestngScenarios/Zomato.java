package TestngScenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
                                      
public class Zomato {

	@Test (groups="Functional")
	public  void NavigatetoZomato() {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.zomato.com/");
		
		Reporter.log("Navigated to zomato",true);
		driver.quit();

	}

}
