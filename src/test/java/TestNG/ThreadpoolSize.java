package TestNG;

import org.testng.annotations.Test;

public class ThreadpoolSize {

	
	@Test
	public void cat() {
		System.out.println("meme");
	}
	@Test (invocationCount =3,threadPoolSize=2)
	public void dog() {
		System.out.println("karuna");
	}
}
