package Irctc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class IRTCTC {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		
        options.addArguments("--disable-notifications");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.irctc.co.in/nget/train-search");

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hyderabad");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//p-calendar[@dateformat='dd/mm/yy']")).click();
		
		driver.findElement(By.xpath("//a[text()='11']")).click();
		
		

driver.findElement(By.xpath("//span[text()='All Classes']")).click();

driver.findElement(By.xpath("//span[text()='Vistadome Non AC (VS)']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()='GENERAL']")).click();
driver.findElement(By.xpath("(//span[text()='LADIES'])[1]")).click();

Thread.sleep(6000);
driver.findElement(By.xpath("//button[text()='Search']")).submit();

			
	
		
	}

}
