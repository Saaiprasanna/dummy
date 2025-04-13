package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion1 {
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("health");
		
		List<WebElement> as = driver.findElements(By.xpath("//a[contains(text(),'health')]"));
		for (WebElement ele : as) 
		   {
			System.out.println(ele.getText());
			}
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'health')])[0]")).click();
}
}
