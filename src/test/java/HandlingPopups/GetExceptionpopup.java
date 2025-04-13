package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetExceptionpopup {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

	       driver.manage().window().maximize();

	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	       
	       Thread.sleep(3000);
	       
	       //When we perform action without click on "OK" we get an exception
	       //org.openqa.selenium.NoAlertPresentException
	       driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	       
	       driver.switchTo().alert();
	       
	       //org.openqa.selenium.NoAlertPresentException
	       
	       //without handling first PopUp try to handle 2nd PopUp we get an exception
	     //org.openqa.selenium.UnhandledAlertException
	       driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
	       
	       //org.openqa.selenium.UnhandledAlertException
	       
	       
	       
	       
	}

}
