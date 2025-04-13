package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingKeyboradActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.facebook.com/");
		
		WebElement email= driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.SHIFT).perform();
		
		email.sendKeys("prasanna");
		
		act.keyUp(Keys.SHIFT).perform();
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
