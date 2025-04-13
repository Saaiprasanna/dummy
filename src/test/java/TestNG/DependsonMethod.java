package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethod {

	@Test (dependsOnMethods="Register")
	public void Login() {
		Reporter.log("Sai",true);
	}
	@Test ()
	public void Register() {
		Reporter.log("Prasanna",true);
	}
	@Test (dependsOnMethods = "Login")
	public void Create() {
		Reporter.log("Karuna",true);
	}
}
