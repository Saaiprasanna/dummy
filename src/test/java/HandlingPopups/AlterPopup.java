package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlterPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

	       driver.manage().window().maximize();

	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
	       
	       Thread.sleep(3000);
	       
	      /* driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	       
	       Thread.sleep(3000);
	       
	       WebElement drpdown  =driver.findElement(By.xpath("//*[name()='svg']"));
	       
	       Select s = new Select(drpdown);
			
		   s.selectByIndex(0);
			
		   Thread.sleep(3000);
	       
	       WebElement element = driver.findElement(By.linkText("Popups"));
	       
	       element.click();*/
	       
	       
	       driver.findElement(By.id("buttonAlert2")).click();
	       
	       Thread.sleep(3000);
	       
	       Alert al = driver.switchTo().alert();
	       
	       Thread.sleep(3000);
	       
	       al.accept();
	       
	       Thread.sleep(3000);
	       
	       
	       driver.findElement(By.xpath("//a[text()='Confirm']")).click();
	       
           driver.findElement(By.id("buttonAlert5")).click();
	       
	       Thread.sleep(3000);
	       
	       Alert al1 = driver.switchTo().alert();
	       
	       Thread.sleep(3000);
	       
	       al1.dismiss();
	       
           driver.findElement(By.xpath("//a[text()='Prompt']")).click();
	       
           driver.findElement(By.id("buttonAlert1")).click();
	       
	       Thread.sleep(3000);
	       
	       Alert al2 = driver.switchTo().alert();
	       
	       Thread.sleep(3000);
	       
	       al2.sendKeys("no");
	       
	       Thread.sleep(3000);
	       
	       al2.accept();
	       
	       Thread.sleep(3000);
	       
	       
	    
			  
		
	}

}
