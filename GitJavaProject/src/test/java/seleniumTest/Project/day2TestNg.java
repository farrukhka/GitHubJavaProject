package seleniumTest.Project;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class day2TestNg {
	
	@Test(groups= {"Smoke"})
	public void ploan()
	{
		
		System.out.println("good");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
}
