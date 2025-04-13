package Training1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
  public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
}
}
