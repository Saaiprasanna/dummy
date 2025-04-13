package TestNG;

import org.testng.annotations.Test;

public class EnabledFlag {

	@Test(enabled = false)
	public void sai() {
		System.out.println("Sai");
	}
	
	@Test
	public void prasanna() {
		System.out.println("Prasanna");
	}
	@Test()
	public void karuna() {
		System.out.println("Karuna");
	}
	
}
