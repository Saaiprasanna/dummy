package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrameUsingIndex {

	public static void main(String[] args) throws InterruptedException {
		
		   WebDriver driver = new ChromeDriver();

	       driver.manage().window().maximize();

	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("https://www.snapdeal.com/");
	       
	       // click on login btn
	       
	        WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
	         
	         Thread.sleep(3000);
	       //mouse over the sign in
	        
	        Actions act = new Actions(driver);
	        
	        act.moveToElement(signin).perform();
	        
	        Thread.sleep(3000);
	        //click on login button
	        
	        driver.findElement(By.xpath("//a[text()='login']")).click();
	        
	        driver.switchTo().frame(0);
	        
	        Thread.sleep(3000);
	        
	        driver.findElement(By.id("userName")).sendKeys("9876543215");
	        
	        Thread.sleep(3000);
	        
	        driver.findElement(By.id("close-pop")).click();
	        
	        Thread.sleep(3000);
	        
	        driver.switchTo().defaultContent();
	        
	        Thread.sleep(3000);
	        
	        driver.findElement(By.id("inputValEnter")).sendKeys("Mobile" + Keys.ENTER);
	        
	        Thread.sleep(3000);
	        
	        
	        
	       
	       

	}

}
