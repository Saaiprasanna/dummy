package HandlingDropdown;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSingleSelect {
	public static void main(String[] args) throws InterruptedException {
		// Launch the Browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		//identify DropDown element
		WebElement drpdown = driver.findElement(By.id("searchDropdownBox"));
		// create object  of select class
		Select s = new Select(drpdown);
		// select option using index
		s.selectByIndex(7);
		Thread.sleep(3000);
		System.out.println("First selected :" +s.getFirstSelectedOption().getText());
		
		//select option using visibility text
		s.selectByVisibleText("Baby");
		Thread.sleep(3000);
		//select option using Value
		s.selectByValue("search-alias=under-ten-dollars");
		Thread.sleep(3000);
		System.out.println("First selected :" +s.getFirstSelectedOption().getText());
		// check the DropDown 
	
		System.out.println(s.isMultiple());
		// Fetch the all the options from the DropDown
		List<WebElement> selected = s.getAllSelectedOptions();
		for(WebElement ele : selected ) {
			System.out.println(ele.getText());
		}
		
		// close the browser
		driver.quit();
		
	}

}
