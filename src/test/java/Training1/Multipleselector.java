package Training1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipleselector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		
		Thread.sleep(3000);
		
		// click on UI Concept
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		
		Thread.sleep(3000);
		
		// to click on Drop down
		
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[.='Multi Select']")).click();
		
		Thread.sleep(3000);
		
		//to select from phone number drop down
		
		 WebElement Phonenumber =driver.findElement(By.id("phone"));	
		                      
	         Select	 select = new Select(Phonenumber);
	         
	         System.out.println("Is the Phn number dropdown is multiple :" +select.isMultiple());
	         
	         Thread.sleep(3000);
	         
	       //  to select country drop down
	 		
			 WebElement countrydropdown =driver.findElement(By.xpath("//select[@id='select-multiple-native']"));	
			                      
		         Select	 c = new Select(countrydropdown);
		         
		         System.out.println("Is the countrydropdown is multiselect :" +c.isMultiple());
		         
		         Thread.sleep(3000);
		
		    c.selectByIndex(1);
		    Thread.sleep(3000);
		    
		    c.selectByValue("India");
		    Thread.sleep(3000);
		    
		    c.selectByValue("China");
		    Thread.sleep(3000);
		     
		    
		    

	}
}
