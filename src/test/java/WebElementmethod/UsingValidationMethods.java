package WebElementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValidationMethods {
 public static void main(String[] args) {
	             WebDriver driver = new ChromeDriver();
	
	             driver.manage().window().maximize();
                 driver.get("https://demowebshop.tricentis.com/");
                 
            WebElement  searchTF = driver.findElement(By.id("small-searchterms"));
	
	if(searchTF.isDisplayed()) 
	{
		System.out.println(searchTF.isDisplayed());
		searchTF.sendKeys("shoes");
	}else 
	{
		System.out.println("Element not displayed");
	}
	    WebElement  searchBTN = driver.findElement(By.xpath("//input[@type='submit']"));
	    if(searchBTN.isEnabled()) 
	    {
	    	System.out.println(searchBTN.isEnabled());
	    	searchBTN.submit();
	    	
	    }else
	    {
	    	System.out.println("Element not disable");
	    }
	    driver.quit();
	      
}
}
