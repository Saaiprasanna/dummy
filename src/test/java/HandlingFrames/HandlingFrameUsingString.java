package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameUsingString {

	public static void main(String[] args) throws InterruptedException {
		
	   WebDriver driver = new ChromeDriver();

       driver.manage().window().maximize();

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
       driver.get("https://www.zomato.com/");
       
       //Click on login button
       driver.findElement(By.linkText("Log in")).click();
       
       //Switch the driver control to the frame
       driver.switchTo().frame("auth-login-ui");
       
       driver.findElement(By.xpath("//input[@type='number']")).sendKeys("7566899645");
       
       driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
       
       Thread.sleep(3000);
       
       //Switch back the driver control to the mainWebpage
       
       driver.switchTo().defaultContent();
       
       System.out.println(driver.getTitle());
       
       
       
       
}
}