package TestNG;

import org.testng.annotations.Test;

public class ProioityFlag {
	
	@Test(priority = -9)
	public void cat() {
		System.out.println("meme");
	}
	@Test (priority = 2)
	public void dog() {
		System.out.println("karuna");
	}
	@Test (priority = -2)
	public void apple() {
		System.out.println("apple");
	}
	@Test (priority = 0)
	public void snake() {
		System.out.println("Sneha");
	}

	

}
