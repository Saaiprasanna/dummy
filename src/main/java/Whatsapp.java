import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {

	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	
    driver.get("https://web.whatsapp.com/");
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[text()='Log in with phone number']")).click();
    
    driver.findElement(By.xpath("//div[text()='India']")).click();
    
    

	}

}
