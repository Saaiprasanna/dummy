package SeleniumPracticeQSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Selenium1 { 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		// Using RLToRightof Method
		
		WebElement searchTF =driver.findElement(By.id("small-searchterms"));
		searchTF.sendKeys("Shoes");
	
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(searchTF)).click();
		Thread.sleep(3000);
		
		//using RLToLeftof Method
		
		 WebElement login =driver.findElement(By.linkText("Log in"));
		 
		 driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(login)).click();
		 Thread.sleep(3000);
		 
		 //using RLNear method
		 
        WebElement label  =driver.findElement(By.xpath("//label[text()='Gender:']"));
		 
		 driver.findElement(RelativeLocator.with(By.tagName("input")).near(label)).click();
		 Thread.sleep(3000);
		 
		
	}

}
