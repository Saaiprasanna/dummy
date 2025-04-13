package HandlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingMultiSelected {

	    public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		
		//identify the dropDown
		
		WebElement Multipledropdown = driver.findElement(By.id("cars"));
		
		//select the options create object for select class
		
		Select s = new Select(Multipledropdown);
		
		s.selectByIndex(0);
		
		Thread.sleep(3000);
		
		s.selectByVisibleText("INR 50 - INR 99 ( 1 )");
		
		Thread.sleep(3000);
		
		s.selectByValue("199");
		
		Thread.sleep(3000);
		
		s.deselectByVisibleText("INR 50 - INR 99 ( 1 )");
		
		Thread.sleep(3000);
		
        System.out.println("First selected :" +s.getFirstSelectedOption().getText());
        
		Thread.sleep(3000);
		
		
		List<WebElement> selected = s.getAllSelectedOptions();
		
		for(WebElement ele:  selected) 
		{
	       System.out.println("selected options :" +ele.getText());
		}
	    Thread.sleep(3000);
	    
       List<WebElement> option = s.getOptions();
		
		for(WebElement ele1: option ) 
	     {
		 System.out.println("options :" +ele1.getText());
	     }
		 Thread.sleep(3000);
		 
		s.deselectAll();
		 
	    Thread.sleep(3000);
	      
	     System.out.println(s.isMultiple());
	      
		 driver.quit();

       }

}
