package TestNG;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test
	public void cat() {
		System.out.println("meme");
	}
	@Test (invocationCount =3)
	public void dog() {
		System.out.println("karuna");
	}
	@Test (priority = -2,invocationCount =3)
	public void apple() {
		System.out.println("apple");
	}

}
