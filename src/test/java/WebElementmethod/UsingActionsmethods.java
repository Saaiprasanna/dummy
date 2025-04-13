package WebElementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingActionsmethods {
	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		
		//Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		//identify searchTF and pass the text
		WebElement sTF =driver.findElement(By.id("small-searchterms"));
		sTF.sendKeys("Shoes");
		Thread.sleep(1000);
		
		//clear the text
		sTF.clear();
		Thread.sleep(1000);
		
		// pass the text
		sTF.sendKeys("Mobiles");
		Thread.sleep(1000);
		
		// Click on submit button // developed using to  2 Conditions form tag and type = submit use submit method
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		Thread.sleep(1000);
		
		//click on register link
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		
		//close the browser
		driver.quit();

		
		
		
	}

}
