package SeleniumPracticeQSP;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		
		
		
		//click on kids
		Thread.sleep(3000);
	 //driver.findElement(By.xpath("//span[text()=\"KIDS\"]")).click();
		
	 //mouse over on kids		
	 WebElement	ele = driver.findElement(By.xpath("//span[@aria-label='KIDS']"));
	 Actions act = new Actions(driver);
     act.moveToElement(ele).perform();
     Thread.sleep(3000);
     
     // Double click on Den i m s under 799
     WebElement  ele1 = driver.findElement(By.xpath("//a[@title='Denims Under 799']"));
     Actions act1 = new Actions(driver);
     act1.doubleClick(ele1).perform();
     Thread.sleep(3000);
     
     //click on sort by 
     driver.findElement(By.xpath("//select[@id='sortBy']")).click();
     
     //Drop down and select What'snew
     
     WebElement sortByDropdown =driver.findElement(By.xpath("//select[@id='sortBy']/option[6]"));
     driver.findElement(By.xpath("//option[@value='relevance']")).click();
     driver.findElement(By.xpath("//option[@value = 'newn']")).click();

     Thread.sleep(3000);
  
  
     WebElement  ele3 = driver.findElement(By.xpath("//strong[text()='KB TEAMSPIRIT TRENDS SELECT']"));
     Actions act3 = new Actions(driver);
     act3.doubleClick(ele3).perform();
 
     Set<String> list = driver.getWindowHandles();
  
    for(String s:list)
    {
	driver.switchTo().window(s);
	Thread.sleep(3000);
	
	if(driver.getTitle().contains("Buy Blue Jeans"))
	{
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'₹')]")).getText());
	}
    }
       driver.close();
	}
}
