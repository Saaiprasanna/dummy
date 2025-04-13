package HandlingPopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
		
		
		//Fetching the parent window id
		String pwid = driver.getWindowHandle();
		
		
		//click on the product
		driver.findElement(By.xpath("//div[text()='OPPO K12x 5G with 45W SUPERVOOC Charger In-The-Box (Breeze Blue, 128 GB)']")).click();
        
		//Fetch the all window ids
		Set<String> wids = driver.getWindowHandles();
		
		for(String s:wids) {
			
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
        
			if(driver.getTitle().contains("OPPO K12x 5G with 45W SUPERVOOC Charger In-The-Box (Feather Pink, 128 GB)  (6 GB RAM)")) {
				
				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
				System.out.println(driver.getTitle());
			}
		}

		driver.quit();
	}

}
