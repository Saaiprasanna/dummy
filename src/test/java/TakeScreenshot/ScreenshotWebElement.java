package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotWebElement {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
       driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.swiggy.com/restaurants");
		
		 WebElement swiggy = driver.findElement(By.xpath("//*[name()='svg'][@width='49']"));
		 
		 
			
			File  src =  swiggy .getScreenshotAs(OutputType.FILE);
			         
			File  dest = new File("./Screenshot/swiggy.png");  

			FileUtils.copyFile(src, dest);
		

	}

}
