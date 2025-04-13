package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

	       driver.manage().window().maximize();

	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	       
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	       
	       driver.switchTo().alert().accept();
	       
	       WebElement result = driver.findElement(By.id("result"));
	       
	       if(result.getText().contains("You successfully clicked an alert"))
	       {
	    	   System.out.println("Alert popup handled");
	       }
	       else
	       {
	    	   System.out.println("Alert popup unhandled");
	       }
	       
	       

	}

}
