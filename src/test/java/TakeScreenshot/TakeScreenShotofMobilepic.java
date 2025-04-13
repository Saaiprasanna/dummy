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



public class TakeScreenShotofMobilepic {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
	       driver.manage().window().maximize();
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			driver.get("https://www.flipkart.com/");
			
			 WebElement flipkart = driver.findElement(By.name("q"));
			 
			 flipkart.sendKeys("Mobile");
			 
			 
			 driver.findElement(By.cssSelector("input[type='text']")).click();
			 
	         Thread.sleep(3000);
			 
			 
			 WebElement flipkart1 = driver.findElement(By.xpath("[class='DByuf4']"));
			 
			 File  src =  flipkart1 .getScreenshotAs(OutputType.FILE);
				         
			 File  dest = new File("./Screenshot/flipkart.png");  

			 FileUtils.copyFile(src, dest);
			 
			 
			 
			 
			 
			 
			
		
			 

	}

}
