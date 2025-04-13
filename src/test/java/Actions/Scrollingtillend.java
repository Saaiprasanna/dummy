package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrollingtillend {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
    driver.manage().window().maximize();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.amazon.in");
		 
		  WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));

		  Thread.sleep(3000);
		  
		  Actions act = new Actions(driver);
		  
		  Thread.sleep(3000);
		  
		  act.scrollToElement(element).perform();
		  
		  

}
}
