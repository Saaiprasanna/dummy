import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
	    driver.get("https://zomato.com/");
	    
	    Thread.sleep(3000);
        
	   WebElement item = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
	    item.sendKeys("Biryani");
	    item.click();
	  // WebElement e= driver.findElement(By.xpath("//p[text()='Hyderbadi Biryani Spots']"));
	  // ele.click();
	    
	   driver.findElement(By.xpath("(//p[text()='Biryani - Delivery'])[1]")).click();
	   
	   driver.findElement(By.xpath("//h4[text()='Pista House']")).click();
	   
	  // System.out.println(rating.getText());
	}

}
