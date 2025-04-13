package OrangeHrm.com;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.linkText("Admin")).click();

		Thread.sleep(8000);

		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Prasanna");

		Thread.sleep(8000);
		
		WebElement Dropdown1 = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));

		Dropdown1.click();

		Thread.sleep(8000);

	    driver.findElement(By.xpath("//div[text()='ESS']")).click();

		Thread.sleep(8000);

		WebElement dropdown2 = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));

		dropdown2.click();
		
		Thread.sleep(8000);
		
	  driver.findElement(By.xpath("(//div[text()='Enabled'])[1]")).click();
		
		Thread.sleep(8000);
		
		/*driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		
	   Thread.sleep(8000);

	   driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click();
	
		//driver.quit();*/

	}

}
