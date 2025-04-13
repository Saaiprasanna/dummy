package POMClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaleElementException {

public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.facebook.com/");
	
	WebElement wb = driver.findElement(By.id("email"));
	wb.sendKeys("Prasanna");
	
	driver.findElement(By.id("pass")).sendKeys("Prasanna@123");
	
	driver.navigate().refresh();
	
	 wb.sendKeys("Prasanna");
	
	
	
}
	
	

}
