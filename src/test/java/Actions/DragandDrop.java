package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		
		WebElement ele = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement target = driver.findElement(By.id("amt7"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(ele, target).perform();

	}

}
