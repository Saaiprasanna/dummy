

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SaaiPrasanna {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).click();

		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));

		Thread.sleep(3000);
		ele.sendKeys("Samsung");

		Thread.sleep(3000);
		ele.click();

		driver.findElement(By.xpath("(//div[text()='samsung'])[1]")).click();

		Thread.sleep(5000);

		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Featured']"));

		Thread.sleep(5000);

		ele1.click();

		Actions a = new Actions(driver);

		a.moveToElement(ele1).perform();

		Thread.sleep(5000);

		WebElement ele2 = driver.findElement(By.xpath("(//a[text()='Price: Low to High'])[1]"));

		ele2.click();

		Thread.sleep(5000);

		WebElement ele3 = driver.findElement(By.xpath("(//div[@class='colorsprite aok-float-left'])[1]"));

		ele3.click();

//   Actions a1= new Actions(driver);
//    
//  a1.scrollToElement(ele3).click().build().perform();

		Thread.sleep(5000);

		String pwid = driver.getWindowHandle();

		WebElement ele5 = driver.findElement(By.xpath("//span[contains(text(),'Redmi Note 13 5')]"));
		String verify_text = ele5.getText();
		ele5.click();

		Set<String> wids = driver.getWindowHandles();

		for (String id : wids) {
			driver.switchTo().window(id);
			if (driver.getTitle().contains("Redmi Note 13 5G")) {

				String actual_text = driver.findElement(By.id("productTitle")).getText();
				if (verify_text.equals(actual_text)) {
					System.out.println("testpass");
				}
			}

		}
		
		
		 WebElement price = driver.findElement(By.xpath("//span[@id='productTitle']/ancestor::div[@id='centerCol']/descendant::span[@class='a-price-whole']"));

		 
		Thread.sleep(5000);
		
		System.out.println(price.getText());

	}

	private static char[] getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
