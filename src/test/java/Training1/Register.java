package Training1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		// launch the browser
		
		ChromeDriver driver = new ChromeDriver();

		// navigate to the URL
		
		   driver.get("https://www.facebook.com/");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   // Maximize the web page
		  driver.manage().window().maximize();
		 
		  
		  //click on the create Account
		  
		 driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		 
		 //to enter the FirstName
		  
		  driver.findElement(By.name("firstname")).sendKeys("Micky");
		 
		  
		  //enter Surname
		  
		  driver.findElement(By.name("lastname")).sendKeys("Mouse");
	
		  
		  
		  //enter mobile no.
		  driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9809875456");
		 
		  
		  // enter new password
		  
          driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Prasanna123@");
          
          
          //enter the date
          driver.findElement(By.xpath("//select[@aria-label='Day']")).sendKeys("10");
         
           
           //enter the month
           driver.findElement(By.xpath("//select[@aria-label='Month']")).sendKeys("sep");
           
           
         //enter the year
           driver.findElement(By.xpath("//select[@aria-label='Year']")).sendKeys("2000");
           
           
           //enter the gender
           
           driver.findElement(By.xpath("//label[text()='Female']")).click();
           
           
           //click on sign up
           
           driver.findElement(By.xpath("//button[@name='websubmit']")).click();
           Thread.sleep(5000);
          
           
           // close the browser
           driver.quit();
           System.out.println("Successfully Created an Account");
           
           
	}
	

	
  

}
