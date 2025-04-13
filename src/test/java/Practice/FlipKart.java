package Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com");
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("smartphones");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	    String pwid = driver. getWindowHandle();
	    
	    Set<String> wids = driver.getWindowHandles();
	    
	    for(String s:wids) {
	    	driver.switchTo().window(s);
	    	if(driver.getCurrentUrl().contains("https://www.flipkart.com/realme-p3-5g-sZX=F5d0add4685"));{
	    		break;
	    	}
	    	
	   }
	     driver.findElement(By.xpath("//div[text()='realme P3 5G (Space Silver, 128 GB)']")).click();
	     
	     
	     
	     WebElement header = driver.findElement(By.xpath("//span[contains(text(),'realme P3 5G')]"));

	     String e = "realme P3 5G";
	     
	     
	     if (header.getText().contains(e)) {
	         System.out.println(e + " test pass");
	     } else {
	         System.out.println("Test not pass");
	     }
	     
	     
	}
	    
	}


