package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://google.com/");
		
		//identifying searchTf and pass text in it
		
		driver.findElement(By.name("q")).sendKeys("comp");
		
		//Inspect all the autosugg and fetch the text from it
		
		List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(text(),'comp')]"));
		for (WebElement ele : sugg) 
		{
			
			System.out.println(ele.getText());
			
		}
		//Identify 3rd element and perform click action
		
		driver.findElement(By.xpath("(//span[contains(text(),'comp')])[5]")).click();
		
		Thread.sleep(3000);
		
	}

}
