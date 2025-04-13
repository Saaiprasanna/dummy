package WebElementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGettermethod {

	public static void main(String[] args) throws InterruptedException {
	
		        // launch the browser
				WebDriver driver = new ChromeDriver();
				Thread.sleep(1000);
				
				//Maximize the window
				driver.manage().window().maximize();
				Thread.sleep(3000);
				
				// navigate to URL
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(1000);
				//FETCH THE text on an element
		        WebElement	sTF	=driver.findElement(By.partialLinkText("Books"));
		        System.out.println("Text :" +sTF.getText());
		        System.out.println("Tagname for Books :" +sTF.getTagName());
		        System.out.println("Location of books"+sTF.getLocation());
		        System.out.println("rect for books :" +sTF.getRect());
		        System.out.println("Books of Xaxis :" +sTF.getRect().getX());
		        System.out.println("Books of Yaxis :" +sTF.getRect().getY());
		        
		        //Fetch the attribute of sTF
		        WebElement sTF1 = driver.findElement(By.id("small-searchterms"));
		        System.out.println("Attribute value :" +sTF1.getAttribute("class"));
		        System.out.println("Tagname for searchTf :" +sTF1.getTagName());
		        System.out.println("size of searchTF :" +sTF1.getSize());
		        System.out.println("rect for searchTF :" +sTF1.getRect()); 
		        System.out.println("Height OF searchTF :" +sTF1.getRect().getHeight());
		        System.out.println("Width OF searchTF :" +sTF1.getRect().getWidth());
		        
		        //Identify register link
		       WebElement reg=  driver.findElement(By.linkText("Register"));
		       System.out.println(reg.getCssValue("fo"));
				
                driver.quit();
	}

}
