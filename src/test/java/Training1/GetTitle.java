package Training1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Amazon.com"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
     
		driver.quit();
	}

}
