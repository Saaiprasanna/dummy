package TestngScenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
                                      
public class Filpkart {
 @Test (groups="Performance")
	public  void NavigatetoFilpkart() {
	 
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.filpkart.com/");
		
	Reporter.log("Navigated to filpkart",true);
	driver.quit();
	
	/*In Group Execution in source code after <suite>  line write <groups>
	 * <run>
	 * <include>name= "Performance"</include> this means include performance related script will only execute
	 * </run>
	 * </groups> we have to write 3 l
	
	
	*/
	
	
	
	
	
	

	}

}
