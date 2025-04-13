package Training1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MM {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://preprod.mentormarvels.com/");
		Thread.sleep(3000);

	driver.findElement(By.cssSelector("a[class='nav-link theme-button1']")).click();
		
		Thread.sleep(1000);
		
		
	}
}
