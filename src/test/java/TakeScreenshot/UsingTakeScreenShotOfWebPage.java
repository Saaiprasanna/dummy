package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTakeScreenShotOfWebPage {
	public static void main(String[] args) throws IOException {
		
WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.zomato.com/");
		
		//S
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File  src =  ts.getScreenshotAs(OutputType.FILE);
		         
		File  dest = new File("./Screenshot/img.png");  

		FileUtils.copyFile(src, dest);
		         
		
		
	}

}
